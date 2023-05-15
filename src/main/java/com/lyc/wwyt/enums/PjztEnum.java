package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 评价状态枚举类
 *
 * @author ChenQi
 */
public enum PjztEnum implements CodeEnum {

    /**
     * 评价中
     */
    PINGJIAZHONG("评价中", "1"),

    /**
     * 已评价
     */
    YIPINGJIA("已评价", "2");

    private final String code;
    private final String value;

    PjztEnum(String code, String value) {
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

