package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TPxzlxxEntity;
import com.lyc.wwyt.dto.TPxzlxxDTO;
import com.lyc.wwyt.vo.TPxzlxxVO;

import java.util.List;

/**
 * 培训资料信息表(t_pxzlxx)表服务接口
 *
 * @author chenqi
 * @since 2023-05-17 16:22:42
 */
public interface TPxzlxxService extends IService<TPxzlxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tPxzlxxDTO 查询参数
     * @return IPage<TPxzlxxVO> tPxzlxxDTO
     */
    IPage<TPxzlxxVO> queryPage(Page<TPxzlxxDTO> page, TPxzlxxDTO tPxzlxxDTO);

    /**
     * 查询所有数据
     *
     * @param tPxzlxxDTO 查询参数
     * @return List<TPxzlxxVO>
     */
    List<TPxzlxxVO> queryList(TPxzlxxDTO tPxzlxxDTO);
}
