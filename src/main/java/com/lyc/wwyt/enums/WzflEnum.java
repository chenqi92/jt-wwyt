package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 物资分类枚举类
 *
 * @author ChenQi
 */
public enum WzflEnum implements CodeEnum {

    /**
     * 事故气体吸收装置
     */
    SGQT_XSZ("事故气体吸收装置", "1"),

    /**
     * 通讯设施
     */
    TX_SS("通讯设施", "2"),

    /**
     * 交通运输工具
     */
    JYYS_GJ("交通运输工具", "3"),

    /**
     * 照明装置
     */
    ZM_ZZ("照明装置", "4"),

    /**
     * 防护器材
     */
    FH_QC("防护器材", "5"),

    /**
     * 其它
     */
    QT("其它", "6");

    private final String code;
    private final String value;

    WzflEnum(String code, String value) {
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

