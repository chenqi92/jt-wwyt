package com.lyc.wwyt.config.check;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 类 EnumValueValidator
 *
 * @author ChenQi
 * @date 2023/5/12
 */
public class EnumValueValidator implements ConstraintValidator<EnumValueConstraint, Object> {

    private Class<? extends CodeEnum> enumClass;

    @Override
    public void initialize(EnumValueConstraint constraint) {
        this.enumClass = constraint.enumClass();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }

        for (CodeEnum enumValue : enumClass.getEnumConstants()) {
            // 用户无论是输入指定的类型的名称或者是名称对应的值都视为通过
            if (enumValue.getCode().equals(value) || enumValue.getValue().equals(value)) {
                return true;
            }
        }

        return false;
    }
}
