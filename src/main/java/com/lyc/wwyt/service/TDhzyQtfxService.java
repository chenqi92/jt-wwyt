package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.dto.TDhzyQtfxDTO;
import com.lyc.wwyt.entity.TDhzyQtfxEntity;
import com.lyc.wwyt.vo.TDhzyQtfxVO;

import java.util.List;

/**
 * 动火作业气体分析数据表(t_dhzy_qtfx)表服务接口
 *
 * @author lhh
 * @since 2023-05-22 14:13:08
 */
public interface TDhzyQtfxService extends IService<TDhzyQtfxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDhzyQtfxDTO 查询参数
     * @return IPage<TDhzyQtfxVO> tDhzyQtfxDTO
     */
    IPage<TDhzyQtfxVO> queryPage(Page<TDhzyQtfxDTO> page, TDhzyQtfxDTO tDhzyQtfxDTO);

    /**
     * 查询所有数据
     *
     * @param tDhzyQtfxDTO 查询参数
     * @return List<TDhzyQtfxVO>
     */
    List<TDhzyQtfxVO> queryList(TDhzyQtfxDTO tDhzyQtfxDTO);
}
