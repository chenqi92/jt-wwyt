package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 生产存储场所产权类别枚举类
 *
 * @author lhh
 */
public enum SccccscqEnum implements CodeEnum {

    /**
     * 自有
     */
    ZY("自有", "0"),

    /**
     * 租贷
     */
    ZD("租贷", "1");

    private final String code;
    private final String value;

    SccccscqEnum(String code, String value) {
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

