package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 隐患类型（专业分类）
 *
 * @author ChenQi
 */
public enum HazardDangerTypeEnum implements CodeEnum {

    /**
     * 安全
     */
    SAFETY("安全", "1"),

    /**
     * 工艺
     */
    TECHNOLOGY("工艺", "2"),

    /**
     * 电气
     */
    ELECTRICAL("电气", "3"),

    /**
     * 仪表
     */
    INSTRUMENT("仪表", "4"),

    /**
     * 消防
     */
    FIRE_FIGHTING("消防", "5"),

    /**
     * 总图
     */
    GENERAL_MAP("总图", "6"),

    /**
     * 设备
     */
    EQUIPMENT("设备", "7"),

    /**
     * 其他
     */
    OTHER("其他", "8");

    private final String code;
    private final String value;

    HazardDangerTypeEnum(String code, String value) {
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
