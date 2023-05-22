package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TLsydzyQtfxEntity;
import com.lyc.wwyt.dto.TLsydzyQtfxDTO;
import com.lyc.wwyt.vo.TLsydzyQtfxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 临时用电气体分析数据表(t_lsydzy_qtfx)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-22 14:22:30
 */
@Mapper
public interface TLsydzyQtfxDao extends BaseMapper<TLsydzyQtfxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tLsydzyQtfxDTO 查询参数
     * @return IPage<TLsydzyQtfxVO>
     */
    IPage<TLsydzyQtfxVO> queryList(Page<TLsydzyQtfxDTO> page, @Param("tLsydzyQtfxDTO") TLsydzyQtfxDTO tLsydzyQtfxDTO);

    /**
     * 查询所有数据
     *
     * @param tLsydzyQtfxDTO 查询参数
     * @return List<TLsydzyQtfxVO>
     */
    List<TLsydzyQtfxVO> queryList(@Param("tLsydzyQtfxDTO") TLsydzyQtfxDTO tLsydzyQtfxDTO);
}
