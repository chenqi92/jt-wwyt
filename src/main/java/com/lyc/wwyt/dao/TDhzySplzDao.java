package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TDhzySplzEntity;
import com.lyc.wwyt.dto.TDhzySplzDTO;
import com.lyc.wwyt.vo.TDhzySplzVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 动火作业作业审批流转记录表(t_dhzy_splz)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-18 15:54:24
 */
@Mapper
public interface TDhzySplzDao extends BaseMapper<TDhzySplzEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TDhzySplzVO>
     */
    List<TDhzySplzVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDhzySplzDTO 查询参数
     * @return IPage<TDhzySplzVO>
     */
    IPage<TDhzySplzVO> selectList(Page<TDhzySplzDTO> page, @Param("tDhzySplzDTO") TDhzySplzDTO tDhzySplzDTO);
}
