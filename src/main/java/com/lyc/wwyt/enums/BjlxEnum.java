package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 报警类型类别枚举类
 *
 * @author lhh
 */
public enum BjlxEnum implements CodeEnum {

    /**
     * 超员
     */
    CY("超员", "1"),

    /**
     * 脱岗
     */
    TG("脱岗", "2"),

    /**
     * 串岗
     */
    CG("串岗", "3"),

    /**
     * 长时间静止
     */
    ZSJJZ("长时间静止", "4"),

    /**
     * 一键求救
     */
    YJQJ("一键求救", "5"),

    /**
     * 人证不符
     */
    RZBF("人证不符", "6");

    private final String code;
    private final String value;

    BjlxEnum(String code, String value) {
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