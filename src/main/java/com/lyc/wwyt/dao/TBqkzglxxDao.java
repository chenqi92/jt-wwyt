package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.dto.TBqkzglxxDTO;
import com.lyc.wwyt.entity.TBqkzglxxEntity;
import com.lyc.wwyt.vo.TBqkzglxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 标签扩展管理信息表(t_bqkzglxx)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-22 14:13:07
 */
@Mapper
public interface TBqkzglxxDao extends BaseMapper<TBqkzglxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tBqkzglxxDTO 查询参数
     * @return IPage<TBqkzglxxVO>
     */
    IPage<TBqkzglxxVO> queryList(Page<TBqkzglxxDTO> page, @Param("tBqkzglxxDTO") TBqkzglxxDTO tBqkzglxxDTO);

    /**
     * 查询所有数据
     *
     * @param tBqkzglxxDTO 查询参数
     * @return List<TBqkzglxxVO>
     */
    List<TBqkzglxxVO> queryList(@Param("tBqkzglxxDTO") TBqkzglxxDTO tBqkzglxxDTO);
}
