package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TDictEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 五位一体_字典表(t_dict)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-10 17:47:12
 */
@Mapper
public interface TDictDao extends BaseMapper<TDictEntity> {

}
