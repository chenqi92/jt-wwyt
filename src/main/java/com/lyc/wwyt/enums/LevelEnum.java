package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 活动级别枚举类
 *
 * @author ChenQi
 */
public enum LevelEnum implements CodeEnum {

    /**
     * 公司级别
     */
    COMPANY("公司", "1"),

    /**
     * 部门级别
     */
    DEPARTMENT("部门", "2"),

    /**
     * 班组级别
     */
    GROUP("班组", "3");

    private final String code;
    private final String value;

    LevelEnum(String code, String value) {
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

