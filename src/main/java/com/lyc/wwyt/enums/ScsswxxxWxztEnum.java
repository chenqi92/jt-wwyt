package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 维修状态类别枚举类
 *
 * @author lhh
 */
public enum ScsswxxxWxztEnum implements CodeEnum {

    /**
     * 维修中
     */
    WXZ("维修中", "1"),

    /**
     * 已修好
     */
    YXH("已修好", "2");

    private final String code;
    private final String value;

    ScsswxxxWxztEnum(String code, String value) {
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

