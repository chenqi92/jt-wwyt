package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TCbsglxxEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 承包商管理信息表(t_cbsglxx)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-12 15:32:04
 */
@Mapper
public interface TCbsglxxDao extends BaseMapper<TCbsglxxEntity> {

}
