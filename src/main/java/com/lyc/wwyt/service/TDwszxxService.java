package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.dto.TDwszxxDTO;
import com.lyc.wwyt.entity.TDwszxxEntity;
import com.lyc.wwyt.vo.TDwszxxVO;

import java.util.List;

/**
 * 点位设置信息表(t_dwszxx)表服务接口
 *
 * @author lhh
 * @since 2023-05-22 14:16:23
 */
public interface TDwszxxService extends IService<TDwszxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tDwszxxDTO 查询参数
     * @return IPage<TDwszxxVO> tDwszxxDTO
     */
    IPage<TDwszxxVO> queryPage(Page<TDwszxxDTO> page, TDwszxxDTO tDwszxxDTO);

    /**
     * 查询所有数据
     *
     * @param tDwszxxDTO 查询参数
     * @return List<TDwszxxVO>
     */
    List<TDwszxxVO> queryList(TDwszxxDTO tDwszxxDTO);
}
