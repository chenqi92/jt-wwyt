package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TPxhdxxEntity;
import com.lyc.wwyt.dto.TPxhdxxDTO;
import com.lyc.wwyt.vo.TPxhdxxVO;

import java.util.List;

/**
 * 培训活动信息表(t_pxhdxx)表服务接口
 *
 * @author chenqi
 * @since 2023-05-19 14:56:41
 */
public interface TPxhdxxService extends IService<TPxhdxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tPxhdxxDTO 查询参数
     * @return IPage<TPxhdxxVO> tPxhdxxDTO
     */
    IPage<TPxhdxxVO> queryPage(Page<TPxhdxxDTO> page, TPxhdxxDTO tPxhdxxDTO);

    /**
     * 查询所有数据
     *
     * @param tPxhdxxDTO 查询参数
     * @return List<TPxhdxxVO>
     */
    List<TPxhdxxVO> queryList(TPxhdxxDTO tPxhdxxDTO);
}
