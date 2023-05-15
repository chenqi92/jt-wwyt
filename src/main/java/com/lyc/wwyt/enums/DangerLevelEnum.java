package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 隐患等级枚举类
 *
 * @author ChenQi
 */
public enum DangerLevelEnum implements CodeEnum {

    /**
     * 一般隐患
     */
    GENERAL("一般隐患", "0"),

    /**
     * 重大隐患
     */
    MAJOR("重大隐患", "1");

    private final String code;
    private final String value;

    DangerLevelEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getValue() {
        return value;
    }
}

