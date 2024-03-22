package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 预案级别枚举类
 *
 * @author ChenQi
 */
public enum YAJBEnum implements CodeEnum {
    /**
     * 公司级
     */
    COMPANY_LEVEL("公司级", "1"),
    /**
     * 分厂级
     */
    FACTORY_LEVEL("分厂级", "2"),
    /**
     * 车间级
     */
    WORKSHOP_LEVEL("车间级", "3");

    private final String code;
    private final String value;

    YAJBEnum(String code, String value) {
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

