package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 点位类型类别枚举类
 *
 * @author lhh
 */
public enum DwlxEnum implements CodeEnum {

    /**
     * 设备设施
     */
    SBSS("设备设施", "1"),

    /**
     * 关键装置重点部位
     */
    GJZZZDBW("关键装置重点部位", "2"),

    /**
     * 重大危险源等
     */
    ZDWXYD("重大危险源等", "3");

    private final String code;
    private final String value;

    DwlxEnum(String code, String value) {
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
