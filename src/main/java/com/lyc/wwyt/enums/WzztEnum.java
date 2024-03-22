package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 物资状态
 *
 * @author ChenQi
 * @date 2023/5/15
 */
public enum WzztEnum implements CodeEnum {

    /**
     * 完好
     */
    WH("完好", "1"),

    /**
     * 维修
     */
    WX("维修", "2");

    private final String code;
    private final String value;

    WzztEnum(String code, String value) {
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
