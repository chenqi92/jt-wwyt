package com.lyc.wwyt.utils;

import cn.hutool.core.codec.Base64;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;
import org.springframework.http.HttpHeaders;

import javax.servlet.http.HttpServletRequest;
import java.nio.charset.StandardCharsets;

import static com.lyc.wwyt.constants.SecurityConstant.BASIC_TYPE;

/**
 * 类 SecurityUtil
 *
 * @author ChenQi
 * @date 2023/5/11
 */
@UtilityClass
public class SecurityUtil {

    /**
     * 从header 请求中的username:password
     *
     * @param header header中的参数
     * @throws RuntimeException if the Basic header is not present or is not valid
     *                          Base64
     */
    @SneakyThrows
    public String[] extractAndDecodeHeader(String header) {

        byte[] base64Token = header.substring(6).getBytes(StandardCharsets.UTF_8);
        byte[] decoded;
        try {
            decoded = Base64.decode(base64Token);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(
                    "Failed to decode basic authentication token");
        }

        String token = new String(decoded, StandardCharsets.UTF_8);

        int delim = token.indexOf(":");

        if (delim == -1) {
            throw new RuntimeException("无法解析的Basic内容");
        }
        return new String[]{token.substring(0, delim), token.substring(delim + 1)};
    }

    /**
     * *从header 请求中的username:password
     *
     * @param request HttpServletRequest
     * @return [username, password]
     */
    @SneakyThrows
    public String[] extractAndDecodeHeader(HttpServletRequest request) {
        String header = request.getHeader(HttpHeaders.AUTHORIZATION);

        if (header == null || !header.startsWith(BASIC_TYPE)) {
            throw new RuntimeException("请求头中授权信息为空!");
        }

        return extractAndDecodeHeader(header);
    }
}
