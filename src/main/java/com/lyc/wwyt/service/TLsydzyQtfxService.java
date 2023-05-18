package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TLsydzyQtfxEntity;
import com.lyc.wwyt.dto.TLsydzyQtfxDTO;
import com.lyc.wwyt.vo.TLsydzyQtfxVO;

import java.util.List;

/**
 * 临时用电气体分析数据表(t_lsydzy_qtfx)表服务接口
 *
 * @author lhh
 * @since 2023-05-18 15:54:58
 */
public interface TLsydzyQtfxService extends IService<TLsydzyQtfxEntity> {

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
     * @return IPage<TLsydzyQtfxVO> tLsydzyQtfxDTO
     */
    IPage<TLsydzyQtfxVO> selectPage(Page<TLsydzyQtfxDTO> page, TLsydzyQtfxDTO tLsydzyQtfxDTO);
}
