package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 使用状态类别枚举类
 *
 * @author lhh
 */
public enum SyztEnum implements CodeEnum {

    /**
     * 未使用
     */
    WSY("未使用", "0"),

    /**
     * 已使用
     */
    YSY("已使用", "1");

    private final String code;
    private final String value;

    SyztEnum(String code, String value) {
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