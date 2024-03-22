package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;
import lombok.Getter;

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
    RECTIFICATION_IN_PROGRESS("0", "整改中", 0),

    /**
     * 待验收
     */
    PENDING_ACCEPTANCE("1", "待验收", 2),

    /**
     * 已验收
     */
    ACCEPTED("9", "已验收", 1);

    private final String value;

    private final String code;

    @Getter
    private final Integer unionType;

    DangerStateEnum(String value, String code, Integer unionType) {
        this.code = code;
        this.value = value;
        this.unionType = unionType;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    public static Integer getRectificationStatus(String value) {
        DangerStateEnum[] dangers = DangerStateEnum.values();
        for (DangerStateEnum danger : dangers) {
            if (value.equals(danger.getValue())) {
                return danger.getUnionType();
            }
        }
        return RECTIFICATION_IN_PROGRESS.getUnionType();
    }
}
