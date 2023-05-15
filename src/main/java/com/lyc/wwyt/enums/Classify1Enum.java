package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 管控措施分类1枚举类
 *
 * @author ChenQi
 */
public enum Classify1Enum implements CodeEnum {

    /**
     * 工程技术
     */
    ENGINEERING_TECHNOLOGY("工程技术", "1"),

    /**
     * 维护保养
     */
    MAINTENANCE("维护保养", "2"),

    /**
     * 操作行为
     */
    OPERATION_BEHAVIOR("操作行为", "3"),

    /**
     * 应急措施
     */
    EMERGENCY_MEASURES("应急措施", "4");

    private final String code;
    private final String value;

    Classify1Enum(String code, String value) {
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
