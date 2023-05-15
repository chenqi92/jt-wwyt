package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 培训类型枚举类
 *
 * @author ChenQi
 */
public enum PxLxEnum implements CodeEnum {

    /**
     * 入职培训
     */
    ENTRY_TRAINING("入职培训", "1"),

    /**
     * 转岗培训
     */
    TRANSFER_TRAINING("转岗培训", "2"),

    /**
     * 复岗培训
     */
    RESUME_TRAINING("复岗培训", "3"),

    /**
     * 取证培训
     */
    CERTIFICATION_TRAINING("取证培训", "4"),

    /**
     * 日常培训
     */
    DAILY_TRAINING("日常培训", "5");

    private final String code;
    private final String value;

    PxLxEnum(String code, String value) {
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
