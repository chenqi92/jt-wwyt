package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 枚举 ApplyStatusEnum
 *
 * @author ChenQi
 * @date 2023/5/23
 */
public enum ApplyStatusEnum implements CodeEnum {

    /**
     * 未开始
     */
    NOT_STARTED("未开始", "1"),

    /**
     * 进行中
     */
    IN_PROGRESS("进行中", "2"),

    /**
     * 已结束
     */
    ENDED("已结束", "3");

    private final String code;

    private final String value;

    ApplyStatusEnum(String code, String value) {
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
