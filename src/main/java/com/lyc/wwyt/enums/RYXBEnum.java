package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 人员性别枚举类
 *
 * @author ChenQi
 */
public enum RYXBEnum implements CodeEnum {
    /**
     * 男
     */
    MAN("男", "1"),
    /**
     * 女
     */
    WOMAN("女", "2");

    private final String code;
    private final String value;

    RYXBEnum(String code, String value) {
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

