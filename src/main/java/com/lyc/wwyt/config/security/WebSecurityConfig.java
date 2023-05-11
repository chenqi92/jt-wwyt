package com.lyc.wwyt.config.security;

import com.lyc.wwyt.config.security.handler.Http401AuthenticationEntryPoint;
import com.lyc.wwyt.config.security.handler.Http403AccessDeniedEntryPoint;
import com.lyc.wwyt.config.security.handler.PermitAllUrlProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.Resource;

/**
 * 类 WebSecurityConfig
 *
 * @author ChenQi
 * @date 2023/5/11
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Resource
    private PermitAllUrlProperties permitAllUrlProperties;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // @formatter:off
        // 防止iframe内容无法展示
        http.headers().frameOptions().disable();
        // 需要权限验证的提示code和文字说明自定义
        http.exceptionHandling().authenticationEntryPoint(new Http401AuthenticationEntryPoint());
        // 自定义403forbidden
        http.exceptionHandling().accessDeniedHandler(new Http403AccessDeniedEntryPoint());
        ExpressionUrlAuthorizationConfigurer<HttpSecurity>
                .ExpressionInterceptUrlRegistry registry = http
                .authorizeRequests();
        // 跨域检测
        registry.antMatchers(HttpMethod.OPTIONS, "/**").permitAll();
        // 忽略鉴权的请求
        permitAllUrlProperties.getIgnoreUrls().forEach(ignoreUrl -> registry.antMatchers(ignoreUrl).permitAll());
        // 对任何请求都进行权限验证
        registry.anyRequest().authenticated()
                .and().httpBasic()
                .and().csrf().disable()
        ;
        registry.and()
                // 移除session
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        // @formatter:on
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
