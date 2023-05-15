package com.lyc.wwyt.enums;


import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 状态枚举类，包含待开、推迟和结束三种状态
 * @author ChenQi
 */
public enum StateEnum implements CodeEnum {

    /**
     * 待开
     */
    WAITING("待开", "1"),

    /**
     * 推迟
     */
    POSTPONED("推迟", "2"),

    /**
     * 结束
     */
    FINISHED("结束", "3");

    private final String code;
    private final String value;

    StateEnum(String code, String value) {
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

