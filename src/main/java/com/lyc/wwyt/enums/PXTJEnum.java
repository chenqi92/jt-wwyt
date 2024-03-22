package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 培训途径枚举类
 *
 * @author ChenQi
 */
public enum PXTJEnum implements CodeEnum {

    /**
     * 线上
     */
    ONLINE("线上", "1"),

    /**
     * 线下
     */
    OFFLINE("线下", "2");

    private final String code;
    private final String value;

    PXTJEnum(String code, String value) {
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
