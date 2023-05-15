package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 是否有有效期枚举类
 *
 * @author ChenQi
 */
public enum SfyyxqEnum implements CodeEnum {

    /**
     * 否
     */
    F("否", "0"),

    /**
     * 是
     */
    S("是", "1");

    private final String code;
    private final String value;

    SfyyxqEnum(String code, String value) {
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

