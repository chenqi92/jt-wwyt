package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TDhzySplzEntity;
import com.lyc.wwyt.dto.TDhzySplzDTO;
import com.lyc.wwyt.vo.TDhzySplzVO;

import java.util.List;

/**
 * 动火作业作业审批流转记录表(t_dhzy_splz)表服务接口
 *
 * @author lhh
 * @since 2023-05-18 15:54:24
 */
public interface TDhzySplzService extends IService<TDhzySplzEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TDhzySplzVO>
     */
    List<TDhzySplzVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDhzySplzDTO 查询参数
     * @return IPage<TDhzySplzVO> tDhzySplzDTO
     */
    IPage<TDhzySplzVO> selectPage(Page<TDhzySplzDTO> page, TDhzySplzDTO tDhzySplzDTO);
}
