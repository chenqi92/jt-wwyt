package com.lyc.wwyt.config.check;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 注解 EnumValueConstraint
 * 这个注解用于校验用户传输的值是否为指定枚举中的值
 *
 * @author ChenQi
 * @date 2023/5/12
 */
@Documented
@Constraint(validatedBy = EnumValueValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface EnumValueConstraint {
    String message() default "不是指定范围内的值，请阅读字典表后重新输入!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    Class<? extends CodeEnum> enumClass();
}
