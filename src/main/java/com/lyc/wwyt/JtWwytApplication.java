package com.lyc.wwyt;

import cn.allbs.annotation.EnableAllbsSwagger3;
import cn.allbs.cache.annotation.EnableAllbsCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAllbsCache
@EnableAllbsSwagger3
@SpringBootApplication
public class JtWwytApplication {

    public static void main(String[] args) {
        SpringApplication.run(JtWwytApplication.class, args);
    }

}
