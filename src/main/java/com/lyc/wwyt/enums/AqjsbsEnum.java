package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 安全警示标示枚举类，包含指示标志、警示作业安全警示标志、逃生避难警示标志和风向警示标志四种类型
 *
 * @author ChenQi
 */
public enum AqjsbsEnum implements CodeEnum {

    /**
     * 指示标志
     */
    INSTRUCTION_SIGN("指示标志", "1"),

    /**
     * 警示作业安全警示标志
     */
    SAFETY_WARNING_SIGN("警示作业安全警示标志", "2"),

    /**
     * 逃生避难警示标志
     */
    ESCAPE_SIGN("逃生避难警示标志", "3"),

    /**
     * 风向警示标志
     */
    WIND_DIRECTION_SIGN("风向警示标志", "4");

    private final String code;
    private final String value;

    AqjsbsEnum(String code, String value) {
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
