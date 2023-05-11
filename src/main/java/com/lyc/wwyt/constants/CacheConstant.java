package com.lyc.wwyt.constants;

/**
 * 类 CacheConstant 缓存
 *
 * @author ChenQi
 * @date 2023/5/11
 */
public interface CacheConstant {

    /**
     * 项目名称
     */
    String PRODUCT = "jt:";

    /**
     * 当前项目模块
     */
    String CURRENT_PARTY = PRODUCT + "wwyt:";

    /**
     * 储存用户信息
     */
    String USER_DETAILS = CURRENT_PARTY + "user_details";
}
