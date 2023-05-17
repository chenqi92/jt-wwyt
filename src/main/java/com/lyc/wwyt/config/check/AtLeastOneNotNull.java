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
@Constraint(validatedBy = AtLeastOneNotNullValidator.class)
@Documented
public @interface AtLeastOneNotNull {
    String message() default "至少有一个不能为空!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String[] fieldNames();

    /**
     * 用于判断一组字段中某一个参数不能为空
     *
     * @return
     */
    String group() default "default";
}
