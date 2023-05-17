package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 作业类别类别枚举类
 *
 * @author lhh
 */
public enum ZylbEnum implements CodeEnum {

    /**
     * 堵盲板
     */
    DMB("堵盲板", "1"),

    /**
     * 抽盲板
     */
    CMB("抽盲板", "2");

    private final String code;
    private final String value;

    ZylbEnum(String code, String value) {
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