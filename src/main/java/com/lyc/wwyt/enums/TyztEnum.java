package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 停用状态类别枚举类
 *
 * @author lhh
 */
public enum TyztEnum implements CodeEnum {

    /**
     * 停用
     */
    TY("停用", "0"),

    /**
     *
     */
    ZY("维修中", "1");

    private final String code;
    private final String value;

    TyztEnum(String code, String value) {
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

