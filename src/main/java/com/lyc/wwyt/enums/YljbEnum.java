package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 演练级别枚举类
 *
 * @author ChenQi
 */
public enum YljbEnum implements CodeEnum {

    /**
     * 公司级
     */
    COMPANY("公司级", "1"),

    /**
     * 分厂级
     */
    FACTORY("分厂级", "2"),

    /**
     * 车间级
     */
    WORKSHOP("车间级", "3");

    private final String code;
    private final String value;

    YljbEnum(String code, String value) {
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
