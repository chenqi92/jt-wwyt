package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.dto.TDhzySplzDTO;
import com.lyc.wwyt.entity.TDhzySplzEntity;
import com.lyc.wwyt.vo.TDhzySplzVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 动火作业作业审批流转记录表(t_dhzy_splz)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-22 14:13:08
 */
@Mapper
public interface TDhzySplzDao extends BaseMapper<TDhzySplzEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDhzySplzDTO 查询参数
     * @return IPage<TDhzySplzVO>
     */
    IPage<TDhzySplzVO> queryList(Page<TDhzySplzDTO> page, @Param("tDhzySplzDTO") TDhzySplzDTO tDhzySplzDTO);

    /**
     * 查询所有数据
     *
     * @param tDhzySplzDTO 查询参数
     * @return List<TDhzySplzVO>
     */
    List<TDhzySplzVO> queryList(@Param("tDhzySplzDTO") TDhzySplzDTO tDhzySplzDTO);
}
