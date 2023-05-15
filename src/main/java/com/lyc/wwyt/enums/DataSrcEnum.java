package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 枚举 DataSrcEnum 管控方式
 *
 * @author ChenQi
 * @date 2023/5/15
 */
public enum DataSrcEnum implements CodeEnum {

    /**
     * 自动化监控
     */
    AUTO_MONITORING("自动化监控", "1"),

    /**
     * 隐患排查
     */
    HIDDEN_CHECK("隐患排查", "2");

    private final String code;
    private final String value;

    DataSrcEnum(String code, String value) {
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

