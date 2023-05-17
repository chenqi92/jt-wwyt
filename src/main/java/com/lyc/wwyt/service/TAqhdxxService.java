package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TAqhdxxEntity;
import com.lyc.wwyt.dto.TAqhdxxDTO;
import com.lyc.wwyt.vo.TAqhdxxVO;

import java.util.List;

/**
 * 安全活动信息表(t_aqhdxx)表服务接口
 *
 * @author chenqi
 * @since 2023-05-17 16:22:48
 */
public interface TAqhdxxService extends IService<TAqhdxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tAqhdxxDTO 查询参数
     * @return IPage<TAqhdxxVO> tAqhdxxDTO
     */
    IPage<TAqhdxxVO> queryPage(Page<TAqhdxxDTO> page, TAqhdxxDTO tAqhdxxDTO);

    /**
     * 查询所有数据
     *
     * @param tAqhdxxDTO 查询参数
     * @return List<TAqhdxxVO>
     */
    List<TAqhdxxVO> queryList(TAqhdxxDTO tAqhdxxDTO);
}
