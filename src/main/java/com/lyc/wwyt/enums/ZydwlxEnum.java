package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 作业单位类型类别枚举类
 *
 * @author lhh
 */
public enum ZydwlxEnum implements CodeEnum {

    /**
     * 内部
     */
    NB("内部", "1"),

    /**
     * 第三方/承包商
     */
    CBS("第三方/承包商", "2");

    private final String code;
    private final String value;

    ZydwlxEnum(String code, String value) {
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

