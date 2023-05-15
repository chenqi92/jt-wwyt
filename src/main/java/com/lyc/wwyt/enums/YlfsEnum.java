package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 枚举 YlfsEnum 演练方式
 *
 * @author ChenQi
 * @date 2023/5/15
 */
public enum YlfsEnum implements CodeEnum {
    // 综合
    COMPREHENSIVE("综合", "1"),
    // 桌面
    DESKTOP("桌面", "2"),
    // 专项
    SPECIAL("专项", "3");

    private final String code;
    private final String value;

    YlfsEnum(String code, String value) {
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
