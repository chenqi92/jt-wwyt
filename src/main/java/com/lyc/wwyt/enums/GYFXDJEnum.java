package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 固有风险等级枚举类
 *
 * @author ChenQi
 */
public enum GYFXDJEnum implements CodeEnum {

    /**
     * 固有风险等级 - Ⅰ
     */
    LEVEL_1("Ⅰ", "1"),

    /**
     * 固有风险等级 - Ⅱ
     */
    LEVEL_2("Ⅱ", "2"),

    /**
     * 固有风险等级 - Ⅲ
     */
    LEVEL_3("Ⅲ", "3"),

    /**
     * 固有风险等级 - Ⅳ
     */
    LEVEL_4("Ⅳ", "4");

    private final String code;
    private final String value;

    GYFXDJEnum(String code, String value) {
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
