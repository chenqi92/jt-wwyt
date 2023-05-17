package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 出入口标记类别枚举类
 *
 * @author lhh
 */
public enum CrkbjEnum implements CodeEnum {

    /**
     * 区域入口
     */
    QYRK("区域入口", "1"),

    /**
     * 区域出口
     */
    QYCK("区域出口", "2"),

    /**
     * 二道门入口
     */
    EDMRK("二道门入口", "3"),

    /**
     * 二道门出口
     */
    EDMCK("二道门出口", "4");

    private final String code;
    private final String value;

    CrkbjEnum(String code, String value) {
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