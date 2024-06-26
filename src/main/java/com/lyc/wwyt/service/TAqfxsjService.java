package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.dto.TAqfxsjDTO;
import com.lyc.wwyt.entity.TAqfxsjEntity;
import com.lyc.wwyt.vo.TAqfxsjVO;

import java.util.List;

/**
 * 安全风险事件表(t_aqfxsj)表服务接口
 *
 * @author chenqi
 * @since 2023-05-19 14:56:52
 */
public interface TAqfxsjService extends IService<TAqfxsjEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tAqfxsjDTO 查询参数
     * @return IPage<TAqfxsjVO> tAqfxsjDTO
     */
    IPage<TAqfxsjVO> queryPage(Page<TAqfxsjDTO> page, TAqfxsjDTO tAqfxsjDTO);

    /**
     * 查询所有数据
     *
     * @param tAqfxsjDTO 查询参数
     * @return List<TAqfxsjVO>
     */
    List<TAqfxsjVO> queryList(TAqfxsjDTO tAqfxsjDTO);
}
