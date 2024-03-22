package com.lyc.wwyt.config.convert.time;

import cn.allbs.common.constant.AllbsCoreConstants;
import cn.allbs.common.constant.DateConstant;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.standard.DateTimeFormatterRegistrar;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.TimeZone;

/**
 * 类 JscksonConfig
 *
 * @author ChenQi
 * @date 2023/5/12
 */
@Configuration
@ConditionalOnClass(ObjectMapper.class)
@AutoConfigureBefore(JacksonAutoConfiguration.class)
@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
public class JacksonConfig implements WebMvcConfigurer {

    @Bean
    @Primary
    @ConditionalOnMissingBean
    public Jackson2ObjectMapperBuilderCustomizer wwytCustomizer() {
        return builder -> {
            builder.locale(Locale.CHINA);
            builder.timeZone(TimeZone.getTimeZone(AllbsCoreConstants.ASIA_SHANGHAI));
            builder.simpleDateFormat(DateConstant.PURE_DATETIME_PATTERN);
            builder.serializerByType(Long.class, ToStringSerializer.instance);
            builder.modules(new JavaTimeParser());
        };
    }

    /**
     * 将传入的时间转为java8 时间
     *
     * @param registry
     */
    @Override
    public void addFormatters(FormatterRegistry registry) {
        DateTimeFormatterRegistrar registrar = new DateTimeFormatterRegistrar();
        registrar.setTimeFormatter(DateTimeFormatter.ofPattern(DateConstant.PURE_TIME_PATTERN));
        registrar.setDateFormatter(DateTimeFormatter.ofPattern(DateConstant.PURE_DATE_PATTERN));
        registrar.setDateTimeFormatter(DateTimeFormatter.ofPattern(DateConstant.PURE_DATETIME_PATTERN));
        registrar.registerFormatters(registry);
    }
}
