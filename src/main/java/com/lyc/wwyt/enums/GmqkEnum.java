package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 规模情况类别枚举类
 *
 * @author lhh
 */
public enum GmqkEnum implements CodeEnum {

    /**
     * 规模以下
     */
    GMYX("规模以下", "0"),

    /**
     * 规模以上
     */
    GMYS("规模以上", "1");

    private final String code;
    private final String value;

    GmqkEnum(String code, String value) {
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

