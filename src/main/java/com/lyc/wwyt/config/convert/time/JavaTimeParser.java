package com.lyc.wwyt.config.convert.time;

import cn.allbs.common.constant.DateConstant;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.PackageVersion;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * 类 JavaTimeParser
 *
 * @author ChenQi
 * @date 2023/5/12
 */
public class JavaTimeParser extends SimpleModule {

    public JavaTimeParser() {
        super(PackageVersion.VERSION);
        this.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer(DateTimeFormatter.ofPattern(DateConstant.PURE_DATETIME_PATTERN)));
        this.addSerializer(LocalDate.class, new LocalDateSerializer(DateTimeFormatter.ofPattern(DateConstant.PURE_DATE_PATTERN)));
        this.addSerializer(LocalTime.class, new LocalTimeSerializer(DateTimeFormatter.ofPattern(DateConstant.PURE_TIME_PATTERN)));
        this.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer(DateTimeFormatter.ofPattern(DateConstant.PURE_DATETIME_PATTERN)));
        this.addDeserializer(LocalDate.class, new LocalDateDeserializer(DateTimeFormatter.ofPattern(DateConstant.PURE_DATE_PATTERN)));
        this.addDeserializer(LocalTime.class, new LocalTimeDeserializer(DateTimeFormatter.ofPattern(DateConstant.PURE_TIME_PATTERN)));
    }
}
