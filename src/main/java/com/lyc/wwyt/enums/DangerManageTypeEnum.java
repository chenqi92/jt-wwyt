package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 治理类型枚举类
 *
 * @author ChenQi
 */
public enum DangerManageTypeEnum implements CodeEnum {

    /**
     * 即查即改
     */
    IMMEDIATE_CORRECTION("即查即改", "0"),

    /**
     * 限期整改
     */
    LIMITED_TIME_CORRECTION("限期整改", "1");

    /**
     * 治理类型描述
     */
    private final String code;

    /**
     * 治理类型值
     */
    private final String value;

    DangerManageTypeEnum(String code, String value) {
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

