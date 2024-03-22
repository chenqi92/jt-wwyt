package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 开停车大检修类型
 *
 * @author ChenQi
 * @date 2023/5/23
 */
public enum PlanTypeEnum implements CodeEnum {

    /**
     * 开车
     */
    RUN("开车", "1"),

    /**
     * 停车
     */
    STOP("停车", "2"),

    /**
     * 检修
     */
    CHECK("检修", "3");

    private final String code;

    private final String value;

    PlanTypeEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getValue() {
        return this.value;
    }

}
