package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 枚举 SmzqEnum
 *
 * @author ChenQi
 * @date 2023/5/15
 */
public enum SmzqEnum implements CodeEnum {
    YITOUYONG("已投用", "1"),
    KUCUNZHONG("库存中", "2"),
    BAOFEI("报废", "3");

    private final String code;
    private final String value;

    SmzqEnum(String code, String value) {
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
