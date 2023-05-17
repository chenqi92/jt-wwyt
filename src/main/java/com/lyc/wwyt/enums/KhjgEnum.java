package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 考核结果枚举类
 *
 * @author ChenQi
 */
public enum KhjgEnum implements CodeEnum {

    /**
     * 合格
     */
    HEGE("合格承包商", "1"),

    /**
     * 不合格
     */
    BUHEGE("不合格承包商", "2");

    private final String code;
    private final String value;

    KhjgEnum(String code, String value) {
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

