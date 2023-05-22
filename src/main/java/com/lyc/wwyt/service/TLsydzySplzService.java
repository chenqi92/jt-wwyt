package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TLsydzySplzEntity;
import com.lyc.wwyt.dto.TLsydzySplzDTO;
import com.lyc.wwyt.vo.TLsydzySplzVO;

import java.util.List;

/**
 * 临时用电作业审批流转记录表(t_lsydzy_splz)表服务接口
 *
 * @author lhh
 * @since 2023-05-22 14:22:30
 */
public interface TLsydzySplzService extends IService<TLsydzySplzEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tLsydzySplzDTO 查询参数
     * @return IPage<TLsydzySplzVO> tLsydzySplzDTO
     */
    IPage<TLsydzySplzVO> queryPage(Page<TLsydzySplzDTO> page, TLsydzySplzDTO tLsydzySplzDTO);

    /**
     * 查询所有数据
     *
     * @param tLsydzySplzDTO 查询参数
     * @return List<TLsydzySplzVO>
     */
    List<TLsydzySplzVO> queryList(TLsydzySplzDTO tLsydzySplzDTO);
}
