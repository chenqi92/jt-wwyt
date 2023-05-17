package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 枚举 DangerStateEnum 隐患状态
 *
 * @author ChenQi
 * @date 2023/5/17
 */
public enum DangerStateEnum implements CodeEnum {

    /**
     * 整改中
     */
    RECTIFICATION_IN_PROGRESS("0", "整改中"),

    /**
     * 待验收
     */
    PENDING_ACCEPTANCE("1", "待验收"),

    /**
     * 已验收
     */
    ACCEPTED("9", "已验收");

    private final String value;

    private final String code;

    DangerStateEnum(String value, String code) {
        this.code = code;
        this.value = value;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getValue() {
        return this.value;
    }
}
