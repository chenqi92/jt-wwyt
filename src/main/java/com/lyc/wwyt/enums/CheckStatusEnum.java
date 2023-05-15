package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 排查结果枚举类
 *
 * @author ChenQi
 */
public enum CheckStatusEnum implements CodeEnum {

    /**
     * 正常
     */
    NORMAL("正常", "0"),

    /**
     * 存在隐患
     */
    HIDDEN_DANGER("存在隐患", "1"),

    /**
     * 未排查
     */
    NOT_INSPECTED("未排查", "2"),

    /**
     * 其他
     */
    OTHER("其他", "3");

    /**
     * 排查结果描述
     */
    private final String code;

    /**
     * 排查结果值
     */
    private final String value;

    CheckStatusEnum(String code, String value) {
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
