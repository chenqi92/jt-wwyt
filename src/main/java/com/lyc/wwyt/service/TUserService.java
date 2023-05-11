package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TUserEntity;

/**
 * 用户表(sys_user)表服务接口
 *
 * @author chenqi
 * @date 2023-5-11 10:55:26
 */
public interface TUserService extends IService<TUserEntity> {

    /**
     * 根据用户名查询用户信息
     *
     * @param username 用户
     * @return userInfo
     */
    TUserEntity findUserInfoByUserName(String username);

}
