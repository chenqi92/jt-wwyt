package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.dto.TGjzzzdbwxxDTO;
import com.lyc.wwyt.entity.TGjzzzdbwxxEntity;
import com.lyc.wwyt.vo.TGjzzzdbwxxVO;

import java.util.List;

/**
 * 关键装置重点部位信息表(t_gjzzzdbwxx)表服务接口
 *
 * @author lhh
 * @since 2023-05-22 14:16:27
 */
public interface TGjzzzdbwxxService extends IService<TGjzzzdbwxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tGjzzzdbwxxDTO 查询参数
     * @return IPage<TGjzzzdbwxxVO> tGjzzzdbwxxDTO
     */
    IPage<TGjzzzdbwxxVO> queryPage(Page<TGjzzzdbwxxDTO> page, TGjzzzdbwxxDTO tGjzzzdbwxxDTO);

    /**
     * 查询所有数据
     *
     * @param tGjzzzdbwxxDTO 查询参数
     * @return List<TGjzzzdbwxxVO>
     */
    List<TGjzzzdbwxxVO> queryList(TGjzzzdbwxxDTO tGjzzzdbwxxDTO);
}
