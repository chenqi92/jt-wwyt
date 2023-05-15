package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 效果评估枚举类
 *
 * @author ChenQi
 */
public enum XgpgEnum implements CodeEnum {
    /**
     * 优秀
     */
    EXCELLENT("优秀", "1"),
    /**
     * 良好
     */
    GOOD("良好", "2"),
    /**
     * 合格
     */
    QUALIFIED("合格", "3"),
    /**
     * 不合格
     */
    UNQUALIFIED("不合格", "4");

    private final String code;
    private final String value;

    XgpgEnum(String code, String value) {
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
