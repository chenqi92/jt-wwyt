package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 性别类别枚举类
 *
 * @author lhh
 */
public enum XbEnum implements CodeEnum {

    /**
     * 男
     */
    NAN("男", "1"),

    /**
     * 女
     */
    NV("女", "2");

    private final String code;
    private final String value;

    XbEnum(String code, String value) {
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

