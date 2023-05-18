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
 * @since 2023-05-18 15:54:58
 */
@Mapper
public interface TLsydzyQtfxDao extends BaseMapper<TLsydzyQtfxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TLsydzyQtfxVO>
     */
    List<TLsydzyQtfxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tLsydzyQtfxDTO 查询参数
     * @return IPage<TLsydzyQtfxVO>
     */
    IPage<TLsydzyQtfxVO> selectList(Page<TLsydzyQtfxDTO> page, @Param("tLsydzyQtfxDTO") TLsydzyQtfxDTO tLsydzyQtfxDTO);
}
