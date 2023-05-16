package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TPxjhxxEntity;
import com.lyc.wwyt.dto.TPxjhxxDTO;
import com.lyc.wwyt.vo.TPxjhxxVO;

import java.util.List;

/**
 * 培训计划信息表(t_pxjhxx)表服务接口
 *
 * @author chenqi
 * @since 2023-05-16 16:33:44
 */
public interface TPxjhxxService extends IService<TPxjhxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TPxjhxxVO>
     */
    List<TPxjhxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tPxjhxxDTO 查询参数
     * @return IPage<TPxjhxxVO> tPxjhxxDTO
     */
    IPage<TPxjhxxVO> selectPage(Page<TPxjhxxDTO> page, TPxjhxxDTO tPxjhxxDTO);
}
