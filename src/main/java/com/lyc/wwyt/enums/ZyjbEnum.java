package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 作业级别类别枚举类
 *
 * @author lhh
 */
public enum ZyjbEnum implements CodeEnum {

    /**
     * Ⅰ级
     */
    ⅠJ("Ⅰ级", "1"),

    /**
     * Ⅱ级
     */
    ⅡJ("Ⅱ级", "2"),

    /**
     * Ⅲ级
     */
    ⅢJ("Ⅲ级", "3"),

    /**
     * Ⅳ级
     */
    ⅣJ("Ⅳ级", "4");

    private final String code;
    private final String value;

    ZyjbEnum(String code, String value) {
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

