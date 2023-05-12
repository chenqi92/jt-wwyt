package com.lyc.wwyt.config.convert;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lyc.wwyt.config.properties.CustomConfigProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;
import java.util.List;

/**
 * 类 WebMvcConfig
 *
 * @author ChenQi
 * @date 2023/5/11
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Resource
    private ObjectMapper objectMapper;

    @Resource
    private CustomConfigProperties customConfigProperties;

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(0, new DecryptingHttpMessageConverter(objectMapper, customConfigProperties));
    }
}
