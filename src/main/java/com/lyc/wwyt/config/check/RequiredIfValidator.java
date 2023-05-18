package com.lyc.wwyt.config.check;

import cn.hutool.core.util.ObjectUtil;
import org.springframework.beans.BeanWrapperImpl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author lhh
 */
public class RequiredIfValidator implements ConstraintValidator<RequiredIf, Object> {
    private String field;
    private String fieldValue;
    private String dependentField;

    @Override
    public void initialize(RequiredIf constraintAnnotation) {
        this.field = constraintAnnotation.field();
        this.fieldValue = constraintAnnotation.fieldValue();
        this.dependentField = constraintAnnotation.dependentField();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        // 禁用默认提示信息
        context.disableDefaultConstraintViolation();
        // 设置提示语
        context.buildConstraintViolationWithTemplate(dependentField + "=" + fieldValue + "时，" + field + "为必填项！")
                .addConstraintViolation();

        BeanWrapperImpl wrapper = new BeanWrapperImpl(value);
        Object dependentValue = wrapper.getPropertyValue(dependentField);
        if (fieldValue.equals(String.valueOf(dependentValue))) {
            Object fieldValue = wrapper.getPropertyValue(field);
            return ObjectUtil.isNotEmpty(fieldValue);
        }
        return true;
    }

}
