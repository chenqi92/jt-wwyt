package com.lyc.wwyt.config.security.handler;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * 类 PermitAllUrlProperties
 *
 * @author ChenQi
 * @date 2023/5/11
 */
@Slf4j
@Configuration
@RequiredArgsConstructor
@ConditionalOnExpression("!'${security.ignore-urls}'.isEmpty()")
@ConfigurationProperties(prefix = "security")
public class PermitAllUrlProperties implements InitializingBean {

    private static final Pattern PATTERN = Pattern.compile("\\{(.*?)\\}");

    private final WebApplicationContext applicationContext;

    @Getter
    @Setter
    private List<String> ignoreUrls = new ArrayList<>();

    @Override
    public void afterPropertiesSet() throws Exception {
    }


}
