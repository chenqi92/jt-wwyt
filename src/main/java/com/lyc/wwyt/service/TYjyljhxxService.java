package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.dto.TYjyljhxxDTO;
import com.lyc.wwyt.entity.TYjyljhxxEntity;
import com.lyc.wwyt.vo.TYjyljhxxVO;

import java.util.List;

/**
 * 应急演练计划信息表(t_yjyljhxx)表服务接口
 *
 * @author chenqi
 * @since 2023-05-19 14:56:43
 */
public interface TYjyljhxxService extends IService<TYjyljhxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tYjyljhxxDTO 查询参数
     * @return IPage<TYjyljhxxVO> tYjyljhxxDTO
     */
    IPage<TYjyljhxxVO> queryPage(Page<TYjyljhxxDTO> page, TYjyljhxxDTO tYjyljhxxDTO);

    /**
     * 查询所有数据
     *
     * @param tYjyljhxxDTO 查询参数
     * @return List<TYjyljhxxVO>
     */
    List<TYjyljhxxVO> queryList(TYjyljhxxDTO tYjyljhxxDTO);
}
