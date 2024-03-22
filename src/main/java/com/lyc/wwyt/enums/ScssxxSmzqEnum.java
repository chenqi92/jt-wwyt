package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 生产设施信息生命周期类别枚举类
 *
 * @author lhh
 */
public enum ScssxxSmzqEnum implements CodeEnum {

    /**
     * 已投用
     */
    YTY("已投用", "1"),

    /**
     * 报废
     */
    BF("报废", "2");

    private final String code;
    private final String value;

    ScssxxSmzqEnum(String code, String value) {
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

