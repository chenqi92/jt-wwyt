package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 区域类型类别枚举类
 *
 * @author lhh
 */
public enum QylxEnum implements CodeEnum {

    /**
     * 二道门外
     */
    EDMW("二道门外", "1"),

    /**
     * 二道门内非风险区域
     */
    EDMNFFXQY("二道门内非风险区域", "2"),

    /**
     * 二道门内四色图区域
     */
    EDMNSSTQY("二道门内四色图区域", "3");

    private final String code;
    private final String value;

    QylxEnum(String code, String value) {
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