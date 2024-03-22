package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 是否发布枚举类
 *
 * @author ChenQi
 */
public enum SffbEnum implements CodeEnum {

    /**
     * 否
     */
    NO("否", "0"),

    /**
     * 是
     */
    YES("是", "1");

    private final String code;
    private final String value;

    SffbEnum(String code, String value) {
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

