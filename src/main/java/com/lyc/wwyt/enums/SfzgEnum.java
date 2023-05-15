package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 是否整改枚举类
 *
 * @author ChenQi
 */
public enum SfzgEnum implements CodeEnum {
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

    SfzgEnum(String code, String value) {
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

