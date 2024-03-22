package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 枚举 RiskClassEnum 风险等级
 *
 * @author ChenQi
 * @date 2023/5/15
 */
public enum RiskClassEnum implements CodeEnum {
    /**
     * 重大风险
     */
    MAJOR_RISK("1", "重大风险"),

    /**
     * 较大风险
     */
    GREATER_RISK("2", "较大风险"),

    /**
     * 一般风险
     */
    GENERAL_RISK("3", "一般风险"),

    /**
     * 低风险
     */
    LOW_RISK("4", "低风险");

    private final String value;
    private final String code;

    RiskClassEnum(String value, String code) {
        this.value = value;
        this.code = code;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String getCode() {
        return code;
    }
}
