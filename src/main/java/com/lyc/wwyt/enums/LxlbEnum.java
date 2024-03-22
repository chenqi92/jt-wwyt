package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 证件类型类别枚举类
 *
 * @author lhh
 */
public enum LxlbEnum implements CodeEnum {

    /**
     * 居民身份证
     */
    JMSFZ("居民身份证", "1"),

    /**
     * 军人证
     */
    JRZ("军人证", "2"),

    /**
     * 港澳台居民身份证
     */
    GATJMSFZ("港澳台居民身份证", "3"),

    /**
     * 华侨身份证
     */
    HQSFZ("华侨身份证", "4"),

    /**
     * 外籍护照
     */
    WJHZ("外籍护照", "5"),

    /**
     * 其他,直接证明人员身份的有效证件
     */
    QT("其他,直接证明人员身份的有效证件", "6");

    private final String code;
    private final String value;

    LxlbEnum(String code, String value) {
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