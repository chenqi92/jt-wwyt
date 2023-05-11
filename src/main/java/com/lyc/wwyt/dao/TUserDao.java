package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TUserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 五位一体用户表(t_user)表数据库访问层
 *
 * @author chenqi
 * @date 2023-5-11 10:53:03
 */
@Mapper
public interface TUserDao extends BaseMapper<TUserEntity> {

}
