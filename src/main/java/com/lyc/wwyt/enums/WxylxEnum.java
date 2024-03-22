package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 重大危险源类别枚举类
 *
 * @author lhh
 */
public enum WxylxEnum implements CodeEnum {

    /**
     * 生产装置
     */
    SCZZ("生产装置", "1"),

    /**
     * 存储储罐
     */
    CCCG("存储储罐", "2"),

    /**
     * 存储库
     */
    CCK("存储库", "3"),

    /**
     * 锅炉
     */
    GL("锅炉", "4");

    private final String code;
    private final String value;

    WxylxEnum(String code, String value) {
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

