package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.dto.TMbcdzySplzDTO;
import com.lyc.wwyt.entity.TMbcdzySplzEntity;
import com.lyc.wwyt.vo.TMbcdzySplzVO;

import java.util.List;

/**
 * 盲板抽堵作业审批流转记录表(t_mbcdzy_splz)表服务接口
 *
 * @author lhh
 * @since 2023-05-22 14:22:31
 */
public interface TMbcdzySplzService extends IService<TMbcdzySplzEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tMbcdzySplzDTO 查询参数
     * @return IPage<TMbcdzySplzVO> tMbcdzySplzDTO
     */
    IPage<TMbcdzySplzVO> queryPage(Page<TMbcdzySplzDTO> page, TMbcdzySplzDTO tMbcdzySplzDTO);

    /**
     * 查询所有数据
     *
     * @param tMbcdzySplzDTO 查询参数
     * @return List<TMbcdzySplzVO>
     */
    List<TMbcdzySplzVO> queryList(TMbcdzySplzDTO tMbcdzySplzDTO);
}
