package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TDzzySplzEntity;
import com.lyc.wwyt.dto.TDzzySplzDTO;
import com.lyc.wwyt.vo.TDzzySplzVO;

import java.util.List;

/**
 * 吊装作业审批流转记录表(t_dzzy_splz)表服务接口
 *
 * @author lhh
 * @since 2023-05-18 15:54:44
 */
public interface TDzzySplzService extends IService<TDzzySplzEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TDzzySplzVO>
     */
    List<TDzzySplzVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDzzySplzDTO 查询参数
     * @return IPage<TDzzySplzVO> tDzzySplzDTO
     */
    IPage<TDzzySplzVO> selectPage(Page<TDzzySplzDTO> page, TDzzySplzDTO tDzzySplzDTO);
}
