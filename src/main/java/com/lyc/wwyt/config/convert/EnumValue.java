package com.lyc.wwyt.config.convert;

import com.lyc.wwyt.config.check.CodeEnum;

import java.lang.annotation.*;

/**
 * 注解 EnumValue
 *
 * @author ChenQi
 * @date 2023/5/12
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnumValue {
    Class<? extends CodeEnum> value();
}
