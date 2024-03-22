package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 隐患来源（检查来源分类）枚举类
 *
 * @author ChenQi
 */
public enum DangerSrcEnum implements CodeEnum {

    /**
     * 日常排查
     */
    DAILY("日常排查", "1"),

    /**
     * 综合性排查
     */
    COMPREHENSIVE("综合性排查", "2"),

    /**
     * 专业性排查
     */
    PROFESSIONAL("专业性排查", "3"),

    /**
     * 季节性排查
     */
    SEASONAL("季节性排查", "4"),

    /**
     * 重点时段及节假日前排查
     */
    KEY_PERIOD("重点时段及节假日前排查", "5"),

    /**
     * 事故类比排查
     */
    ACCIDENT_ANALOGY("事故类比排查", "6"),

    /**
     * 复产复工前排查
     */
    RESTART_WORK("复产复工前排查", "7"),

    /**
     * 外聘专家诊断式排查
     */
    EXPERT_DIAGNOSIS("外聘专家诊断式排查", "8"),

    /**
     * 管控措施失效
     */
    MEASURE_FAILURE("管控措施失效", "9"),

    /**
     * 其他
     */
    OTHER("其他", "10");

    private final String code;
    private final String value;

    DangerSrcEnum(String code, String value) {
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

