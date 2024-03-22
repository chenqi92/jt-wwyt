package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 队伍级别枚举类
 *
 * @author ChenQi
 */
public enum DwjbEnum implements CodeEnum {

    /**
     * 公司
     */
    GS("公司", "1"),

    /**
     * 分厂-车间
     */
    FC_CJ("分厂-车间", "2"),

    /**
     * 工序-班组
     */
    GX_BZ("工序-班组", "3");

    private final String code;
    private final String value;

    DwjbEnum(String code, String value) {
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

