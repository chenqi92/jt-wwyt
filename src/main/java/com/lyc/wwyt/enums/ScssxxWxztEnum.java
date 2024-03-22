package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 维修状态类别枚举类
 *
 * @author lhh
 */
public enum ScssxxWxztEnum implements CodeEnum {

    /**
     * 完好
     */
    WH("完好", "1"),

    /**
     * 维修中
     */
    WXZ("维修中", "2");

    private final String code;
    private final String value;

    ScssxxWxztEnum(String code, String value) {
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

