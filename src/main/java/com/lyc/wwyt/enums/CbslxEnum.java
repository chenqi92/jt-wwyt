package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 承包商类型枚举类
 *
 * @author ChenQi
 */
public enum CbslxEnum implements CodeEnum {
    /**
     * 环境改造
     */
    HJGZ("环境改造", "1"),
    /**
     * 工程检修安装
     */
    GCJXAZ("工程检修安装", "2"),
    /**
     * 建筑施工
     */
    JZSG("建筑施工", "3"),
    /**
     * 吊装作业
     */
    DZZY("吊装作业", "4"),
    /**
     * 其他
     */
    QT("其他", "5");

    private final String code;
    private final String value;

    CbslxEnum(String code, String value) {
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

