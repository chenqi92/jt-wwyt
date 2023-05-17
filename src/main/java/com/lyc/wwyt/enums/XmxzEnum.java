package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 项目性质类别枚举类
 *
 * @author lhh
 */
public enum XmxzEnum implements CodeEnum {

    /**
     * 新建
     */
    XJ("新建", "1"),

    /**
     * 改扩建
     */
    GKJ("改扩建", "2"),

    /**
     * 技改项目
     */
    JGXM("技改项目", "3");

    private final String code;
    private final String value;

    XmxzEnum(String code, String value) {
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

