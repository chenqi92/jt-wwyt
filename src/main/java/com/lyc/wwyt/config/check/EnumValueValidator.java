package com.lyc.wwyt.config.check;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;

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
            return false;
        }

        return Arrays.stream(enumClass.getEnumConstants()).anyMatch(enumConstant -> enumConstant.getCode().equalsIgnoreCase(value.toString()) || enumConstant.getValue().equalsIgnoreCase(value.toString()));
    }
}
