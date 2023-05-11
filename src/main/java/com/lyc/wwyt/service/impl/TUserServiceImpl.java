package com.lyc.wwyt.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TUserDao;
import com.lyc.wwyt.entity.TUserEntity;
import com.lyc.wwyt.exception.UserNameNotExistException;
import com.lyc.wwyt.service.TUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


/**
 * 五位一体用户表(t_user)表服务实现类
 *
 * @author chenqi
 * @date 2023-5-11 10:56:08
 */
@Service("tUserService")
@AllArgsConstructor
public class TUserServiceImpl extends ServiceImpl<TUserDao, TUserEntity> implements TUserService {

    private final TUserDao tUserDao;

//    private final CacheManager cacheManager;

    /**
     * 根据用户名查询用户信息
     *
     * @param username 用户
     * @return userInfo
     */
    @Override
    public TUserEntity findUserInfoByUserName(String username) {
//        Cache cache = cacheManager.getCache(USER_DETAILS);
//        if (cache != null && cache.get(username) != null) {
//            return cache.get(username, TUserEntity.class);
//        }
        TUserEntity sysUserEntity = tUserDao.selectOne(Wrappers.<TUserEntity>query().lambda().eq(TUserEntity::getUsername, username));
        if (BeanUtil.isEmpty(sysUserEntity)) {
            throw new UserNameNotExistException();
        }
//        assert cache != null;
//        cache.put(username, sysUserEntity);
        return sysUserEntity;
    }
}
