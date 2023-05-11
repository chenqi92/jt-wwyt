package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 日志表(t_log)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-11 09:41:45
 */
@Mapper
public interface TLogDao extends BaseMapper<TLogEntity> {

}
