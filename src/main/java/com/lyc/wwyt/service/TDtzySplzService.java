package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TDtzySplzEntity;
import com.lyc.wwyt.dto.TDtzySplzDTO;
import com.lyc.wwyt.vo.TDtzySplzVO;

import java.util.List;

/**
 * 动土作业审批流转记录表(t_dtzy_splz)表服务接口
 *
 * @author lhh
 * @since 2023-05-18 15:54:37
 */
public interface TDtzySplzService extends IService<TDtzySplzEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TDtzySplzVO>
     */
    List<TDtzySplzVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDtzySplzDTO 查询参数
     * @return IPage<TDtzySplzVO> tDtzySplzDTO
     */
    IPage<TDtzySplzVO> selectPage(Page<TDtzySplzDTO> page, TDtzySplzDTO tDtzySplzDTO);
}
