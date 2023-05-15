package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 发生环节枚举类
 *
 * @author ChenQi
 */
public enum OccurrenceLinkEnum implements CodeEnum {

    /**
     * 设计
     */
    DESIGN("设计", "1"),

    /**
     * 产品质量缺陷
     */
    PRODUCT_QUALITY_DEFECT("产品质量缺陷", "2"),

    /**
     * 仓储
     */
    STORAGE("仓储", "3"),

    /**
     * 项目施工
     */
    PROJECT_CONSTRUCTION("项目施工", "4"),

    /**
     * 开停车
     */
    OPENING_AND_CLOSING("开停车", "5"),

    /**
     * 使用操作
     */
    OPERATING("使用操作", "6"),

    /**
     * 维护保养
     */
    MAINTENANCE("维护保养", "7"),

    /**
     * 维修
     */
    REPAIR("维修", "8"),

    /**
     * 变更
     */
    CHANGE("变更", "9"),

    /**
     * 运输
     */
    TRANSPORTATION("运输", "10");

    private final String code;
    private final String value;

    private OccurrenceLinkEnum(String code, String value) {
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

