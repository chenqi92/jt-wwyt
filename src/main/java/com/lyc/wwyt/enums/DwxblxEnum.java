package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 定位信标类型类别枚举类
 *
 * @author lhh
 */
public enum DwxblxEnum implements CodeEnum {

    /**
     * 生成区信标
     */
    SCQXB("生成区信标", "1"),

    /**
     * 出入口信标
     */
    CRKXB("出入口信标", "2"),

    /**
     * 其他
     */
    QT("其他", "3");

    private final String code;
    private final String value;

    DwxblxEnum(String code, String value) {
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