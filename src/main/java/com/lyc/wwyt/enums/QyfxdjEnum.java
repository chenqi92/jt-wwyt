package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 区域风险等级类别枚举类
 *
 * @author lhh
 */
public enum QyfxdjEnum implements CodeEnum {

    /**
     * 一级
     */
    YIJ("一级", "1"),

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

    QyfxdjEnum(String code, String value) {
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