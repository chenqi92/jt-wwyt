package com.lyc.wwyt.config.excel;

import cn.allbs.excel.head.HeadGenerator;
import cn.allbs.excel.head.HeadMeta;
import com.alibaba.excel.annotation.ExcelIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * 类 CustomHead
 *
 * @author ChenQi
 * @date 2023/5/22
 */
@Component
public class CustomHead implements HeadGenerator {
    @Override
    public HeadMeta head(Class<?> clazz) {
        HeadMeta headMeta = new HeadMeta();
        List<List<String>> heads = new LinkedList<>();
        Set<Class<?>> visitedClasses = new HashSet<>();
        while (clazz != null && !visitedClasses.contains(clazz)) {
            visitedClasses.add(clazz);

            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                if ("serialVersionUID".equals(field.getName()) || field.isAnnotationPresent(ExcelIgnore.class)) {
                    continue;
                }
                List<String> fieldList = new LinkedList<>();
                StringBuilder sb = new StringBuilder();
                if (field.isAnnotationPresent(Schema.class)) {
                    Schema schema = field.getAnnotation(Schema.class);
                    String value = schema.description();
                    sb.append(value);
                    sb.append("\n");
                }
                sb.append(field.getName());
                fieldList.add(sb.toString());
                heads.add(fieldList);
            }
            clazz = clazz.getSuperclass();
        }
        headMeta.setHead(heads);
        return headMeta;
    }
}
