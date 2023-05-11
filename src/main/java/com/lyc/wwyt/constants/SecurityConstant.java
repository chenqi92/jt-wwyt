package com.lyc.wwyt.constants;

/**
 * 接口 SecurityConstant
 *
 * @author ChenQi
 * @date 2023/5/11
 */
public interface SecurityConstant {

    /**
     * 签名
     */
    String SIGNING_KEY = "lyc";

    /**
     * 正常用户
     */
    String STATUS_NORMAL = "0";

    /**
     * 冻结
     */
    String STATUS_LOCK = "9";

    /**
     * Bearer
     */
    String BEARER_TYPE = "Bearer ";

    /**
     * Basic
     */
    String BASIC_TYPE = "Basic ";

    /**
     * token
     */
    String TOKEN = "token";
}
