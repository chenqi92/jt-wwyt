package com.lyc.wwyt.config.convert;

import com.lyc.wwyt.config.check.CodeEnum;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * 类 EnumValueArgumentResolver
 *
 * @author ChenQi
 * @date 2023/5/12
 */
public class EnumValueArgumentResolver implements HandlerMethodArgumentResolver {

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.hasParameterAnnotation(EnumValue.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter,
                                  ModelAndViewContainer mavContainer,
                                  NativeWebRequest webRequest,
                                  WebDataBinderFactory binderFactory) throws Exception {

        String param = webRequest.getParameter(parameter.getParameterName());
        Class<? extends CodeEnum> enumClass = parameter.getParameterAnnotation(EnumValue.class).value();

        for (CodeEnum enumValue : enumClass.getEnumConstants()) {
            if (enumValue.getCode().equals(param)) {
                // If the parameter matches the code, return the corresponding value
                return enumValue.getValue();
            } else if (String.valueOf(enumValue.getValue()).equals(param)) {
                // If the parameter matches the value, return the value as is
                return enumValue.getValue();
            }
        }

        throw new IllegalArgumentException("Invalid enum value");
    }
}
