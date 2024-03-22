package com.lyc.wwyt.config.check;

/**
 * 接口 CodeEnum 和字典表对应的枚举接口
 *
 * @author ChenQi
 * @date 2023/5/12
 */
public interface CodeEnum {

    /**
     * 字典表中的code值 一般为中文字符串
     *
     * @return
     */
    String getCode();

    /**
     * 字典表中的value值 一般为数值,但是也不妨碍某些赣头非要把不定性的参数放里面，破坏既定的规则
     *
     * @return
     */
    String getValue();
}
