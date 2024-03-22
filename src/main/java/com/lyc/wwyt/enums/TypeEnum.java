package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 枚举 TypeEnum
 *
 * @author ChenQi
 * @date 2023/5/15
 */
public enum TypeEnum implements CodeEnum {

    /**
     * 奖励
     */
    REWARD("奖励", "1"),

    /**
     * 处罚
     */
    PENALTY("处罚", "2");

    private final String code;
    private final String value;

    TypeEnum(String code, String value) {
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
