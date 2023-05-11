package com.lyc.wwyt.config.security.handler;

import cn.allbs.common.utils.R;
import cn.allbs.common.utils.ResponseUtil;
import com.lyc.wwyt.config.SystemCode;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 类 Http403AccessDeniedEntryPoint
 *
 * @author ChenQi
 * @date 2023/5/11
 */
public class Http403AccessDeniedEntryPoint implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        ResponseUtil.out(response, R.fail(SystemCode.FORBIDDEN_403));
    }
}
