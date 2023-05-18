package com.lyc.wwyt.config.check;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 注解 AtLeastOneNotNull
 *
 * @author ChenQi
 * @date 2023/5/17
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = RequiredIfValidator.class)
@Documented
public @interface RequiredIf {
    String message() default "参数有误";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    String field();
    String fieldValue();
    String dependentField();
}
