package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 当前状态类别枚举类
 *
 * @author lhh
 */
public enum DqztEnum implements CodeEnum {

    /**
     * 作业前
     */
    ZYQ("作业前", "1"),

    /**
     * 作业中
     */
    ZYZ("作业中", "2"),

    /**
     * 作业后
     */
    ZYH("作业后", "3");

    private final String code;
    private final String value;

    DqztEnum(String code, String value) {
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