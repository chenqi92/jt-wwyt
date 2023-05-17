package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 装置部位分类类别枚举类
 *
 * @author lhh
 */
public enum ZzbwflEnum implements CodeEnum {

    /**
     * 关键装置
     */
    GJZZ("关键装置", "1"),

    /**
     * 重点部位
     */
    ZDBW("重点部位", "2");

    private final String code;
    private final String value;

    ZzbwflEnum(String code, String value) {
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