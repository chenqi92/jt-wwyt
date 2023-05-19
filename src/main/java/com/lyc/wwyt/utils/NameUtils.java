package com.lyc.wwyt.utils;

import lombok.experimental.UtilityClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 类 NameUtils
 *
 * @author ChenQi
 * @date 2023/5/18
 */
@UtilityClass
public class NameUtils {

    /**
     * 转驼峰命名正则匹配规则
     */
    private static final Pattern TO_HUMP_PATTERN = Pattern.compile("[-_]([a-z0-9])");
    private static final Pattern TO_LINE_PATTERN = Pattern.compile("[A-Z]+");


    /**
     * 驼峰转下划线，全小写
     *
     * @param str 驼峰字符串
     * @return 下划线字符串
     */
    public static String hump2Underline(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Matcher matcher = TO_LINE_PATTERN.matcher(str);
        StringBuffer buffer = new StringBuffer();
        while (matcher.find()) {
            if (matcher.start() > 0) {
                matcher.appendReplacement(buffer, "_" + matcher.group(0).toLowerCase());
            } else {
                matcher.appendReplacement(buffer, matcher.group(0).toLowerCase());
            }
        }
        matcher.appendTail(buffer);
        return buffer.toString();
    }

    /**
     * 下划线中横线命名转驼峰命名（类名）
     *
     * @param name 名称
     * @return 结果
     */
    public static String getClassName(String name) {
        return firstLowerCase(getJavaName(name));
    }

    /**
     * 首字母大写方法
     *
     * @param name 名称
     * @return 结果
     */
    public String firstUpperCase(String name) {
        return StringUtils.capitalize(name);
    }

    /**
     * 首字母小写方法
     *
     * @param name 名称
     * @return 结果
     */
    public String firstLowerCase(String name) {
        return StringUtils.uncapitalize(name);
    }

    /**
     * 下划线中横线命名转驼峰命名（属性名）
     *
     * @param name 名称
     * @return 结果
     */
    public String getJavaName(String name) {
        if (StringUtils.isEmpty(name)) {
            return name;
        }
        // 强转全小写
        name = name.toLowerCase();
        Matcher matcher = TO_HUMP_PATTERN.matcher(name.toLowerCase());
        StringBuffer buffer = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(buffer, matcher.group(1).toUpperCase());
        }
        matcher.appendTail(buffer);
        return buffer.toString();
    }
}
