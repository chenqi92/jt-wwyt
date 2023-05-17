package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TCbspdglxxEntity;
import com.lyc.wwyt.dto.TCbspdglxxDTO;
import com.lyc.wwyt.vo.TCbspdglxxVO;

import java.util.List;

/**
 * 承包商评定管理信息表(t_cbspdglxx)表服务接口
 *
 * @author chenqi
 * @since 2023-05-16 16:33:48
 */
public interface TCbspdglxxService extends IService<TCbspdglxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TCbspdglxxVO>
     */
    List<TCbspdglxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page          分页参数
     * @param tCbspdglxxDTO 查询参数
     * @return IPage<TCbspdglxxVO> tCbspdglxxDTO
     */
    IPage<TCbspdglxxVO> selectPage(Page<TCbspdglxxDTO> page, TCbspdglxxDTO tCbspdglxxDTO);
}
