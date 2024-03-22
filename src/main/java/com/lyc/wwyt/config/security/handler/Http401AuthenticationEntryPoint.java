package com.lyc.wwyt.config.security.handler;

import cn.allbs.common.utils.R;
import cn.allbs.common.utils.ResponseUtil;
import com.lyc.wwyt.config.SystemCode;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 类 Http401AuthenticationEntryPoint
 * 自定义需要权限认证的返回信息
 *
 * @author ChenQi
 * @date 2023/5/11
 */
public class Http401AuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        ResponseUtil.out(response, R.fail(SystemCode.USERNAME_OR_PASSWORD_ERROR));
    }
}
