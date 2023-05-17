package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 项目三同时类别类别枚举类
 *
 * @author lhh
 */
public enum XmstslbEnum implements CodeEnum {

    /**
     * 安全
     */
    AQ("安全", "1"),

    /**
     * 环保
     */
    HB("环保", "3"),

    /**
     * 消防
     */
    XF("消防", "4"),

    /**
     * 职业卫生
     */
    ZYWS("职业卫生", "5");

    private final String code;
    private final String value;

    XmstslbEnum(String code, String value) {
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

