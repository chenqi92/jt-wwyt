package com.lyc.wwyt.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 类 CustomConfigProperties
 *
 * @author ChenQi
 * @date 2023/5/12
 */
@Data
@Component
@ConfigurationProperties(prefix = "custom")
public class CustomConfigProperties {

    /**
     * AES 加解密秘钥
     */
    private String aesKey;

    /**
     * AES 加解密偏移量
     */
    private String initializationVector;
}
