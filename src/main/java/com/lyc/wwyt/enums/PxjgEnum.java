package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 培训结果枚举类
 *
 * @author ChenQi
 */
public enum PxjgEnum implements CodeEnum {

    /**
     * 合格
     */
    QUALIFIED("合格", "1"),

    /**
     * 不合格
     */
    UNQUALIFIED("不合格", "2");

    /**
     * 培训结果的code
     */
    private final String code;

    /**
     * 培训结果的value
     */
    private final String value;

    PxjgEnum(String code, String value) {
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

