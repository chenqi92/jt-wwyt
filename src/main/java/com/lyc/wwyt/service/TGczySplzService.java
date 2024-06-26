package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.dto.TGczySplzDTO;
import com.lyc.wwyt.entity.TGczySplzEntity;
import com.lyc.wwyt.vo.TGczySplzVO;

import java.util.List;

/**
 * 高处作业审批流转记录表(t_gczy_splz)表服务接口
 *
 * @author lhh
 * @since 2023-05-22 14:16:26
 */
public interface TGczySplzService extends IService<TGczySplzEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tGczySplzDTO 查询参数
     * @return IPage<TGczySplzVO> tGczySplzDTO
     */
    IPage<TGczySplzVO> queryPage(Page<TGczySplzDTO> page, TGczySplzDTO tGczySplzDTO);

    /**
     * 查询所有数据
     *
     * @param tGczySplzDTO 查询参数
     * @return List<TGczySplzVO>
     */
    List<TGczySplzVO> queryList(TGczySplzDTO tGczySplzDTO);
}
