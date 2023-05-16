package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TAqsczrclkxxEntity;
import com.lyc.wwyt.dto.TAqsczrclkxxDTO;
import com.lyc.wwyt.vo.TAqsczrclkxxVO;

import java.util.List;

/**
 * 安全生产责任承诺卡信息表(t_aqsczrclkxx)表服务接口
 *
 * @author chenqi
 * @since 2023-05-16 16:33:49
 */
public interface TAqsczrclkxxService extends IService<TAqsczrclkxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TAqsczrclkxxVO>
     */
    List<TAqsczrclkxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page            分页参数
     * @param tAqsczrclkxxDTO 查询参数
     * @return IPage<TAqsczrclkxxVO> tAqsczrclkxxDTO
     */
    IPage<TAqsczrclkxxVO> selectPage(Page<TAqsczrclkxxDTO> page, TAqsczrclkxxDTO tAqsczrclkxxDTO);
}
