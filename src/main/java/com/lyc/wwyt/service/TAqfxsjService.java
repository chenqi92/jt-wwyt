package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TAqfxsjEntity;
import com.lyc.wwyt.dto.TAqfxsjDTO;
import com.lyc.wwyt.vo.TAqfxsjVO;

import java.util.List;

/**
 * 安全风险事件表(t_aqfxsj)表服务接口
 *
 * @author chenqi
 * @since 2023-05-16 16:33:58
 */
public interface TAqfxsjService extends IService<TAqfxsjEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TAqfxsjVO>
     */
    List<TAqfxsjVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tAqfxsjDTO 查询参数
     * @return IPage<TAqfxsjVO> tAqfxsjDTO
     */
    IPage<TAqfxsjVO> selectPage(Page<TAqfxsjDTO> page, TAqfxsjDTO tAqfxsjDTO);
}
