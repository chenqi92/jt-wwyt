package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 动火作业级别类别枚举类
 *
 * @author lhh
 */
public enum DhzyjbEnum implements CodeEnum {

    /**
     * 特级
     */
    TJ("特级", "1"),

    /**
     * 一级
     */
    YJ("一级", "2"),

    /**
     * 二级
     */
    EJ("二级", "3");

    private final String code;
    private final String value;

    DhzyjbEnum(String code, String value) {
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

