package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 生产经营活动类型类别枚举类
 *
 * @author lhh
 */
public enum ScjyhdlxEnum implements CodeEnum {

    /**
     * 生产
     */
    SC("生产", "1"),

    /**
     * 经营
     */
    JY("经营", "2"),

    /**
     * 使用
     */
    SY("使用", "3"),

    /**
     * 存储
     */
    CC("存储", "4");

    private final String code;
    private final String value;

    ScjyhdlxEnum(String code, String value) {
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

