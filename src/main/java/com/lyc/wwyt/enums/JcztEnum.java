package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 检查状态类别枚举类
 *
 * @author lhh
 */
public enum JcztEnum implements CodeEnum {

    /**
     * 正常
     */
    ZC("正常", "1"),

    /**
     * 异常
     */
    YC("异常", "2");

    private final String code;
    private final String value;

    JcztEnum(String code, String value) {
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

