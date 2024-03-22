package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 气体类型类别枚举类
 *
 * @author lhh
 */
public enum QtlxEnum implements CodeEnum {

    /**
     * 有毒
     */
    YD("有毒", "1"),

    /**
     * 可燃
     */
    KR("可燃", "2"),

    /**
     * 氧气
     */
    YQ("氧气", "3");

    private final String code;
    private final String value;

    QtlxEnum(String code, String value) {
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