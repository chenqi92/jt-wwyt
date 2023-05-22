package com.lyc.wwyt.config;

import cn.allbs.common.code.IResultCode;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 枚举 SystemCode
 *
 * @author ChenQi
 * @date 2023/5/11
 */
@Getter
@RequiredArgsConstructor
@ApiModel(description = "自定义异常code")
public enum SystemCode implements IResultCode {

    /**
     * 自定义异常code枚举
     */
    FORBIDDEN_401(401, "授权验证不通过!请求接口请加入正确的验证信息!"),

    TOKEN_NOT_IN_SYSTEM(401001, "token失效!"),

    AUTHORIZATION_ERROR(401002, "权限处理逻辑出现异常!"),

    USERNAME_OR_PASSWORD_ERROR(421, "用户名或密码错误"),

    USER_NOT_FOUND_ERROR(401004, "指定用户不存在!"),

    FORBIDDEN_403(403, "缺少资源访问权限!"),

    DES_ERROR(501, "数据体解密失败!请核对加密方式是否正确！"),
    ;

    /**
     * code编码
     */
    private final int code;
    /**
     * 中文信息描述
     */
    private final String msg;
}
