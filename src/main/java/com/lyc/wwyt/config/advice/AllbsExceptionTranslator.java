package com.lyc.wwyt.config.advice;

import cn.allbs.common.code.SystemCode;
import cn.allbs.common.constant.StringPool;
import cn.allbs.common.context.DefaultAllbsContext;
import cn.allbs.common.context.IContext;
import cn.allbs.common.enums.ErrorType;
import cn.allbs.common.exception.ServiceException;
import cn.allbs.common.utils.AllbsWebUtils;
import cn.allbs.common.utils.R;
import cn.allbs.common.utils.StringUtil;
import com.lyc.wwyt.utils.ErrorUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServletRequest;

/**
 * 未知异常转译和发送，方便监听，对未知异常统一处理。Order 排序优先级低
 *
 * @author ChenQi
 */
@Slf4j
@Order
@RestControllerAdvice
@Configuration(proxyBeanMethods = false)
@ConditionalOnClass({Servlet.class, DispatcherServlet.class})
@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
public class AllbsExceptionTranslator {

    private final IContext iContent;
    private final ApplicationEventPublisher publisher;

    @Autowired
    public AllbsExceptionTranslator(ObjectProvider<IContext> allbsContextProvider,
                                    ApplicationEventPublisher publisher) {
        this.iContent = allbsContextProvider.getIfAvailable(DefaultAllbsContext::new);
        this.publisher = publisher;
    }

    @ExceptionHandler(ServiceException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public R<Object> handleError(ServiceException e) {
        log.error("业务异常", e);
        R<Object> result = e.getResult();
        if (result == null) {
            // 发送：未知业务异常事件
            result = R.fail(SystemCode.FAILURE, e.getMessage());
            publishEvent(e);
        }
        return result;
    }

    @ExceptionHandler(Throwable.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public R<Object> handleError(Throwable e) {
        log.error("未知异常", e);
        // 发送：未知异常异常事件
        publishEvent(e);
        return R.fail(SystemCode.FAILURE);
    }

    private void publishEvent(Throwable error) {
        AllbsErrorEvent event = new AllbsErrorEvent();
        // 服务异常类型
        event.setErrorType(ErrorType.REQUEST);
        // 异步获取不到的一些信息
        event.setRequestId(iContent.getRequestId());
        HttpServletRequest request = AllbsWebUtils.getRequest();
        // 请求方法名
        event.setRequestMethod(request.getMethod());
        // 拼接地址
        String requestUrl = request.getRequestURI();
        String queryString = request.getQueryString();
        if (StringUtil.isNotBlank(queryString)) {
            requestUrl = requestUrl + StringPool.QUESTION_MARK + queryString;
        }
        // 请求ip
        event.setRequestIp(AllbsWebUtils.getIP(request));
        event.setRequestUrl(requestUrl);
        // 堆栈信息
        ErrorUtil.initErrorInfo(error, event);
        // 发布事件，其他参数可监听时异步获取
        publisher.publishEvent(event);
    }
}
