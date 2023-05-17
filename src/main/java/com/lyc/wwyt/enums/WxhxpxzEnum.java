package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 危险化学品性质类别枚举类
 *
 * @author lhh
 */
public enum WxhxpxzEnum implements CodeEnum {

    /**
     * 易燃
     */
    YR("易燃", "1"),

    /**
     * 有毒
     */
    YD("有毒", "2"),

    /**
     * 兼有易燃有毒
     */
    JYYRYD("兼有易燃有毒", "3");

    private final String code;
    private final String value;

    WxhxpxzEnum(String code, String value) {
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

