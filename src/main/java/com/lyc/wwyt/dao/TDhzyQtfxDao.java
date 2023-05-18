package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TDhzyQtfxEntity;
import com.lyc.wwyt.dto.TDhzyQtfxDTO;
import com.lyc.wwyt.vo.TDhzyQtfxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 动火作业气体分析数据表(t_dhzy_qtfx)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-18 15:54:22
 */
@Mapper
public interface TDhzyQtfxDao extends BaseMapper<TDhzyQtfxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TDhzyQtfxVO>
     */
    List<TDhzyQtfxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDhzyQtfxDTO 查询参数
     * @return IPage<TDhzyQtfxVO>
     */
    IPage<TDhzyQtfxVO> selectList(Page<TDhzyQtfxDTO> page, @Param("tDhzyQtfxDTO") TDhzyQtfxDTO tDhzyQtfxDTO);
}
