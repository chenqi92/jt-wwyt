package com.lyc.wwyt.config.advice;

import cn.allbs.common.code.SystemCode;
import cn.allbs.common.exception.ServiceException;
import cn.allbs.common.utils.R;
import cn.allbs.common.utils.StringUtil;
import cn.hutool.core.bean.BeanUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.lang.Nullable;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.RequestDispatcher;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

/**
 * @author ChenQi
 */
@Slf4j
@SuppressWarnings("unchecked")
public class AllbsErrorAttributes extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, ErrorAttributeOptions options) {
        // 请求地址
        String requestUrl = this.getAttr(webRequest, RequestDispatcher.ERROR_REQUEST_URI);
        if (StringUtil.isBlank(requestUrl)) {
            requestUrl = this.getAttr(webRequest, RequestDispatcher.FORWARD_REQUEST_URI);
        }
        // status code
        Integer status = this.getAttr(webRequest, RequestDispatcher.ERROR_STATUS_CODE);
        // error
        Throwable error = getError(webRequest);
        log.error("URL:{} error status:{}", requestUrl, status, error);
        R<Object> result;
        if (error instanceof ServiceException) {
            result = ((ServiceException) error).getResult();
            result = Optional.ofNullable(result).orElse(R.fail(SystemCode.FAILURE));
        } else {
            result = R.fail(Optional.ofNullable(status).orElse(SystemCode.FAILURE.getCode()), StringUtil.format("接口异常，请联系开发人员并提供接口名称[{}]及异常状态值[{}]", requestUrl, status), new ArrayList<>());
        }
        return BeanUtil.beanToMap(result);
    }

    @Nullable
    private <T> T getAttr(WebRequest webRequest, String name) {
        return (T) webRequest.getAttribute(name, RequestAttributes.SCOPE_REQUEST);
    }
}
