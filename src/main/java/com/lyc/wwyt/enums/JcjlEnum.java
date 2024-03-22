package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 检查结论枚举类
 *
 * @author ChenQi
 */
public enum JcjlEnum implements CodeEnum {

    /**
     * 正常
     */
    NORMAL("正常", "1"),

    /**
     * 异常
     */
    ABNORMAL("异常", "2"),

    /**
     * 未检
     */
    UNCHECKED("未检", "3");

    private final String code;
    private final String value;

    JcjlEnum(String code, String value) {
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

