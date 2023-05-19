package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TCbssgglxxEntity;
import com.lyc.wwyt.dto.TCbssgglxxDTO;
import com.lyc.wwyt.vo.TCbssgglxxVO;

import java.util.List;

/**
 * 承包商施工管理信息表(t_cbssgglxx)表服务接口
 *
 * @author chenqi
 * @since 2023-05-19 14:56:43
 */
public interface TCbssgglxxService extends IService<TCbssgglxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page          分页参数
     * @param tCbssgglxxDTO 查询参数
     * @return IPage<TCbssgglxxVO> tCbssgglxxDTO
     */
    IPage<TCbssgglxxVO> queryPage(Page<TCbssgglxxDTO> page, TCbssgglxxDTO tCbssgglxxDTO);

    /**
     * 查询所有数据
     *
     * @param tCbssgglxxDTO 查询参数
     * @return List<TCbssgglxxVO>
     */
    List<TCbssgglxxVO> queryList(TCbssgglxxDTO tCbssgglxxDTO);
}
