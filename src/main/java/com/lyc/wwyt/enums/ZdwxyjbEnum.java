package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 重大危险源级别类别枚举类
 *
 * @author lhh
 */
public enum ZdwxyjbEnum implements CodeEnum {

    /**
     * 一级
     */
    YYJ("一级", "1"),

    /**
     * 二级
     */
    ERJ("二级", "2"),

    /**
     * 三级
     */
    SANJ("三级", "3"),

    /**
     * 四级
     */
    SIJ("四级", "4");

    private final String code;
    private final String value;

    ZdwxyjbEnum(String code, String value) {
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

