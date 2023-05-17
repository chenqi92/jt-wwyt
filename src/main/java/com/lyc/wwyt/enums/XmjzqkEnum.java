package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 项目进展情况类别枚举类
 *
 * @author lhh
 */
public enum XmjzqkEnum implements CodeEnum {

    /**
     * 进行中
     */
    JXZ("进行中", "1"),

    /**
     * 已完成
     */
    YWC("已完成", "2"),

    /**
     * 终止
     */
    ZZ("终止", "3");

    private final String code;
    private final String value;

    XmjzqkEnum(String code, String value) {
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

