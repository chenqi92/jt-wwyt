package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 管控措施分类2枚举类
 *
 * @author ChenQi
 */
public enum Classify2Enum implements CodeEnum {
    /**
     * 工艺控制
     */
    PROCESS_CONTROL("工艺控制", "1-1"),
    /**
     * 关键设备/部件
     */
    KEY_EQUIPMENT_COMPONENTS("关键设备/部件", "1-2"),
    /**
     * 安全附件
     */
    SAFETY_ATTACHMENTS("安全附件", "1-3"),
    /**
     * 安全仪表
     */
    SAFETY_INSTRUMENTS("安全仪表", "1-4"),
    /**
     * 其他
     */
    OTHER1("其他", "1-5"),
    /**
     * 动设备
     */
    MOVING_EQUIPMENT("动设备", "2-1"),
    /**
     * 静设备
     */
    STATIC_EQUIPMENT("静设备", "2-2"),
    /**
     * 人员资质
     */
    PERSONNEL_QUALIFICATION("人员资质", "3-1"),
    /**
     * 操作记录
     */
    OPERATION_RECORD("操作记录", "3-2"),
    /**
     * 交接班
     */
    SHIFT_HANDOVER("交接班", "3-3"),
    /**
     * 应急设施
     */
    EMERGENCY_FACILITIES("应急设施", "4-1"),
    /**
     * 个体防护
     */
    PERSONAL_PROTECTION("个体防护", "4-2"),
    /**
     * 消防设施
     */
    FIRE_FACILITIES("消防设施", "4-3"),
    /**
     * 应急预案
     */
    EMERGENCY_PLAN("应急预案", "4-4"),
    /**
     * 其他
     */
    OTHER2("其他", "4-5");

    private final String code;
    private final String value;

    Classify2Enum(String code, String value) {
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

