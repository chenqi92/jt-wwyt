package com.lyc.wwyt.config.check;

import cn.allbs.common.utils.ObjectUtil;
import org.springframework.beans.BeanWrapperImpl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 注解 AtLeastOneNotNullValidator 用于校验一组字段是否不为空
 *
 * @author ChenQi
 * @date 2023/5/17
 */
public class AtLeastOneNotNullValidator implements ConstraintValidator<AtLeastOneNotNull, Object> {
    private String[] fieldNames;
    private String group;

    @Override
    public void initialize(AtLeastOneNotNull constraintAnnotation) {
        this.fieldNames = constraintAnnotation.fieldNames();
        this.group = constraintAnnotation.group();  // 初始化group变量
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        BeanWrapperImpl wrapper = new BeanWrapperImpl(value);
        for (String fieldName : fieldNames) {
            // 新增的条件判断：只有当字段的组名与注解的组名相符时，才进行非空校验
            Object fieldValue;
            if (fieldName.startsWith(group + ".")) {
                fieldValue = wrapper.getPropertyValue(fieldName.substring(group.length() + 1));
            } else {
                fieldValue = wrapper.getPropertyValue(fieldName);
            }
            if (ObjectUtil.isNotEmpty(fieldValue)) {
                return true;
            }
        }
        return false;
    }
}
