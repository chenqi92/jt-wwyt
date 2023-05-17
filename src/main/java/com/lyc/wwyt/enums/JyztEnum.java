package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 经营状态类别枚举类
 *
 * @author lhh
 */
public enum JyztEnum implements CodeEnum {

    /**
     * 在业
     */
    ZY("在业", "1"),

    /**
     * 停业
     */
    TY("停业", "2");

    private final String code;
    private final String value;

    JyztEnum(String code, String value) {
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

