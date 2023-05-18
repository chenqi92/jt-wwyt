package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 区域类型类别枚举类
 *
 * @author lhh
 */
public enum ZyqylxEnum implements CodeEnum {

    /**
     * 报警区域
     */
    BJQY("报警区域", "1"),

    /**
     * 电子围栏
     */
    DZWL("电子围栏", "2"),

    /**
     * 紧急避难点
     */
    JJBND("紧急避难点", "3"),

    /**
     * 二道门
     */
    EDM("二道门", "4");

    private final String code;
    private final String value;

    ZyqylxEnum(String code, String value) {
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