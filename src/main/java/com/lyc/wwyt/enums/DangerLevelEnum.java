package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;
import lombok.Getter;

/**
 * 隐患等级枚举类
 *
 * @author ChenQi
 */
public enum DangerLevelEnum implements CodeEnum {

    /**
     * 一般隐患
     */
    GENERAL("一般隐患", "0", 1),

    /**
     * 重大隐患
     */
    MAJOR("重大隐患", "1", 0);

    private final String code;
    private final String value;

    @Getter
    private final Integer unionType;

    DangerLevelEnum(String code, String value, Integer unionType) {
        this.code = code;
        this.value = value;
        this.unionType = unionType;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getValue() {
        return value;
    }

    /**
     * 获取本地表中相关联的隐患级别
     *
     * @param value
     * @return
     */
    public static Integer getRiskLevel(String value) {
        DangerLevelEnum[] dangers = DangerLevelEnum.values();
        for (DangerLevelEnum danger : dangers) {
            if (value.equals(danger.getValue())) {
                return danger.getUnionType();
            }
        }
        return GENERAL.getUnionType();
    }
}

