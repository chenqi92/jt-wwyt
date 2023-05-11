package com.lyc.wwyt;

import cn.allbs.annotation.EnableAllbsSwagger3;
import cn.allbs.core.annotation.AllbsExceptionAdvice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAllbsSwagger3
@AllbsExceptionAdvice
@SpringBootApplication
public class JtWwytApplication {

    public static void main(String[] args) {
        SpringApplication.run(JtWwytApplication.class, args);
    }

}
