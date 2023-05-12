package com.lyc.wwyt.constants;

/**
 * 接口 ParamConstant 参数常量
 *
 * @author ChenQi
 * @date 2023/5/12
 */
public interface ParamConstant {

    /**
     * 单条限制提交数量
     */
    Integer LIMIT_COUNT = 100;

    /**
     * 单个接口请求速率
     */
    Integer LIMIT_RATE = 180;

    /**
     * 限制请求提示
     */
    String LIMIT_PROMPT = "3分钟内最多请求一次!";
}
