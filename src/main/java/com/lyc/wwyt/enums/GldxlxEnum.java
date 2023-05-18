package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 关联对象类型类别枚举类
 *
 * @author lhh
 */
public enum GldxlxEnum implements CodeEnum {

    /**
     * 自定义区域
     */
    ZDYQY("自定义区域", "0"),

    /**
     * 危险源
     */
    WXY("危险源", "1"),

    /**
     * 建筑物
     */
    JZW("建筑物", "2"),

    /**
     * 管线
     */
    GX("管线", "3"),

    /**
     * 高风险区域（后续可扩展）
     */
    GFXQY("高风险区域", "4");

    private final String code;
    private final String value;

    GldxlxEnum(String code, String value) {
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