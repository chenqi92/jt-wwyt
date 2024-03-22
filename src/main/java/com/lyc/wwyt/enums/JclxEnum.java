package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 检查类型枚举类
 *
 * @author ChenQi
 */
public enum JclxEnum implements CodeEnum {

    /**
     * 日常排查
     */
    RCPAICHA("日常排查", "1"),

    /**
     * 综合性排查
     */
    ZONGHEXING_PAICHA("综合性排查", "2"),

    /**
     * 专业性排查
     */
    ZHUANYEXING_PAICHA("专业性排查", "3"),

    /**
     * 季节性排查
     */
    JIJIEPAICHA("季节性排查", "4"),

    /**
     * 重点时段及节假日前排查
     */
    ZHONGDIANSHIDUAN_JIEJIAQIAN_PAICHA("重点时段及节假日前排查", "5"),

    /**
     * 事故类比排查
     */
    SHIGU_LEIBI_PAICHA("事故类比排查", "6"),

    /**
     * 复产复工前排查
     */
    FUCANFUGONGQIAN_PAICHA("复产复工前排查", "7"),

    /**
     * 外聘专家诊断式排查
     */
    WAIPIANZHUANJIA_ZHENGNANSHI_PAICHA("外聘专家诊断式排查", "8");

    private final String code;
    private final String value;

    JclxEnum(String code, String value) {
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

