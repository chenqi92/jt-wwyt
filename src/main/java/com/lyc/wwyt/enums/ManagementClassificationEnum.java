package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 人物管理分类
 *
 * @author ChenQi
 */
public enum ManagementClassificationEnum implements CodeEnum {

    /**
     * 人的不安全行为
     */
    UNSAFE_BEHAVIOR("人的不安全行为", "1"),

    /**
     * 物的不安全状态
     */
    UNSAFE_STATE("物的不安全状态", "2"),

    /**
     * 管理上的缺陷
     */
    MANAGEMENT_DEFECT("管理上的缺陷", "3");

    private final String code;
    private final String value;

    ManagementClassificationEnum(String code, String value) {
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

