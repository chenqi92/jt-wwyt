package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 人员类型类别枚举类
 *
 * @author lhh
 */
public enum RylxEnum implements CodeEnum {

    /**
     * 分管领导
     */
    FGLD("分管领导", "1"),

    /**
     * 带班领导
     */
    DBLD("带班领导", "2"),

    /**
     * 安全总监
     */
    AQZJ("安全总监", "3"),

    /**
     * 安全管理部门负责人
     */
    AQGLBMFZR("安全管理部门负责人", "4"),

    /**
     * 车间主任
     */
    CJZR("车间主任", "5"),

    /**
     * 安全管理人员
     */
    AQGLRY("安全管理人员", "6"),

    /**
     * 特种作业人员
     */
    TZZYRY("特种作业人员", "7"),

    /**
     * 外来作业人员
     */
    WLZYRY("外来作业人员", "8"),

    /**
     * 主要负责人
     */
    ZYFZR("主要负责人", "9");

    private final String code;
    private final String value;

    RylxEnum(String code, String value) {
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