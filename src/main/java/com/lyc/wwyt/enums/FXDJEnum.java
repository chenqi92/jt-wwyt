package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 风险等级枚举类
 *
 * @author ChenQi
 */
public enum FXDJEnum implements CodeEnum {

    /**
     * 一级
     */
    LEVEL1("一级", "1"),

    /**
     * 二级
     */
    LEVEL2("二级", "2"),

    /**
     * 三级
     */
    LEVEL3("三级", "3"),

    /**
     * 四级
     */
    LEVEL4("四级", "4");

    private final String code;
    private final String value;

    FXDJEnum(String code, String value) {
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
