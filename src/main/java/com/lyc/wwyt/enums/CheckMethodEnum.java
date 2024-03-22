package com.lyc.wwyt.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 枚举类功能:
 *
 * @author ChenQi
 * @version 1.0
 * @date 2020/11/27 14:51
 */
@Getter
@AllArgsConstructor
public enum CheckMethodEnum {

    /**
     * 隐患检查类型
     */
    QYZC("企业自查", 0, "check_method"),

    YQJC("园区检查", 1, "check_method"),

    SJBMZJJC("上级部门及专家检查", 2, "check_method");

    private final String code;

    private final Integer value;

    private final String type;

    public static Integer getEnumByValue(Integer value) {
        if (value == null) {
            return null;
        }
        CheckMethodEnum[] enums = CheckMethodEnum.values();
        for (CheckMethodEnum en : enums) {
            if (value.equals(en.value)) {
                return en.value;
            }
        }
        return null;
    }

    public static String getCodeByValue(Integer value) {
        if (value == null) {
            return null;
        }
        CheckMethodEnum[] enums = CheckMethodEnum.values();
        for (CheckMethodEnum en : enums) {
            if (value.equals(en.value)) {
                return en.code;
            }
        }
        return null;
    }
}
