package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 作业类型类别枚举类
 *
 * @author lhh
 */
public enum ZylxEnum implements CodeEnum {

    /**
     * 动火
     */
    DH("动火", "1"),

    /**
     * 受限空间
     */
    SXKJ("受限空间", "2"),

    /**
     * 盲板抽堵
     */
    MBCD("盲板抽堵", "3"),

    /**
     * 高处
     */
    GC("高处", "4"),

    /**
     * 吊装
     */
    DZ("吊装", "5"),

    /**
     * 临时用电
     */
    LSYD("临时用电", "6"),

    /**
     * 动土
     */
    DT("动土", "7"),

    /**
     * 断路
     */
    DL("断路", "8");

    private final String code;
    private final String value;

    ZylxEnum(String code, String value) {
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