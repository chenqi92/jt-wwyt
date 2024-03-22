package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 控制风险等级枚举类
 *
 * @author ChenQi
 */
public enum KZFXDJEnum implements CodeEnum {
    /**
     * A
     */
    A("A", "1"),
    /**
     * B
     */
    B("B", "2"),
    /**
     * C
     */
    C("C", "3"),
    /**
     * D
     */
    D("D", "4");

    private final String code;
    private final String value;

    KZFXDJEnum(String code, String value) {
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

