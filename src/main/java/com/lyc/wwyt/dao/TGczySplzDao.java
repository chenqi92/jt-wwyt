package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.dto.TGczySplzDTO;
import com.lyc.wwyt.entity.TGczySplzEntity;
import com.lyc.wwyt.vo.TGczySplzVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 高处作业审批流转记录表(t_gczy_splz)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-22 14:16:26
 */
@Mapper
public interface TGczySplzDao extends BaseMapper<TGczySplzEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tGczySplzDTO 查询参数
     * @return IPage<TGczySplzVO>
     */
    IPage<TGczySplzVO> queryList(Page<TGczySplzDTO> page, @Param("tGczySplzDTO") TGczySplzDTO tGczySplzDTO);

    /**
     * 查询所有数据
     *
     * @param tGczySplzDTO 查询参数
     * @return List<TGczySplzVO>
     */
    List<TGczySplzVO> queryList(@Param("tGczySplzDTO") TGczySplzDTO tGczySplzDTO);
}
