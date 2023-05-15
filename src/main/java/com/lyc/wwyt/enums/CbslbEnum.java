package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 承包商类别枚举类
 *
 * @author ChenQi
 */
public enum CbslbEnum implements CodeEnum {

    /**
     * 准承包商
     */
    ZC_BS("准承包商", "1"),

    /**
     * 合格承包商
     */
    HG_BS("合格承包商", "2"),

    /**
     * 不合格承包商
     */
    BHG_BS("不合格承包商", "3");

    private final String code;
    private final String value;

    CbslbEnum(String code, String value) {
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

