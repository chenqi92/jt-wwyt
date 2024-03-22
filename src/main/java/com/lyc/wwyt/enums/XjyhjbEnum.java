package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 巡检隐患级别类别枚举类
 *
 * @author lhh
 */
public enum XjyhjbEnum implements CodeEnum {

    /**
     * 一般
     */
    YB("一般", "1"),

    /**
     * 重大
     */
    ZD("重大", "2");

    private final String code;
    private final String value;

    XjyhjbEnum(String code, String value) {
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

