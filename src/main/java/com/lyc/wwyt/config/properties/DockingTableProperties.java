package com.lyc.wwyt.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 类 DockingTableProperties
 *
 * @author ChenQi
 * @date 2023/7/10
 */
@Data
@Component
@ConfigurationProperties(prefix = "middle-table")
public class DockingTableProperties {

    /**
     * 待接入的表名
     */
    private List<String> tables;
}
