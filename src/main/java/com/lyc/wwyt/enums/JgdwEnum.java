package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 分析结果单位类别枚举类
 *
 * @author lhh
 */
public enum JgdwEnum implements CodeEnum {

    /**
     * %
     */
    HUNDREDPERCENT("%", "1"),

    /**
     * ppm
     */
    ppm("ppm", "2"),

    /**
     * mg/m³
     */
    MGPERCUBICMETRE("mg/m³", "3");

    private final String code;
    private final String value;

    JgdwEnum(String code, String value) {
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