package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 标签类型类别枚举类
 *
 * @author lhh
 */
public enum BqlxEnum implements CodeEnum {

    /**
     * 内部人员
     */
    NBRY("内部人员", "1"),

    /**
     * 来访人员
     */
    LFRY("来访人员", "2"),

    /**
     * 外包人员
     */
    WBRY("外包人员", "3"),

    /**
     * 车辆
     */
    CL("车辆", "4"),

    /**
     * 来访车辆
     */
    LFCL("来访车辆", "5"),

    /**
     * 其它
     */
    QT("其它", "6");

    private final String code;
    private final String value;

    BqlxEnum(String code, String value) {
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