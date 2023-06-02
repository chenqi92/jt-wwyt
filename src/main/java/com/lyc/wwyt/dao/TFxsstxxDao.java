package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.dto.TFxsstxxDTO;
import com.lyc.wwyt.entity.TFxsstxxEntity;
import com.lyc.wwyt.vo.TFxsstxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 风险四色图信息表(t_fxsstxx)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-19 14:56:44
 */
@Mapper
public interface TFxsstxxDao extends BaseMapper<TFxsstxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page        分页参数
     * @param tFxsstxxDTO 查询参数
     * @return IPage<TFxsstxxVO>
     */
    IPage<TFxsstxxVO> queryList(Page<TFxsstxxDTO> page, @Param("tFxsstxxDTO") TFxsstxxDTO tFxsstxxDTO);

    /**
     * 查询所有数据
     *
     * @param tFxsstxxDTO 查询参数
     * @return List<TFxsstxxVO>
     */
    List<TFxsstxxVO> queryList(@Param("tFxsstxxDTO") TFxsstxxDTO tFxsstxxDTO);
}
