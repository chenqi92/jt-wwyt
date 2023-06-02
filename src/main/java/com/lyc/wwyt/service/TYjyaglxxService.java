package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.dto.TYjyaglxxDTO;
import com.lyc.wwyt.entity.TYjyaglxxEntity;
import com.lyc.wwyt.vo.TYjyaglxxVO;

import java.util.List;

/**
 * 应急预案管理信息表(t_yjyaglxx)表服务接口
 *
 * @author chenqi
 * @since 2023-05-19 14:56:48
 */
public interface TYjyaglxxService extends IService<TYjyaglxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tYjyaglxxDTO 查询参数
     * @return IPage<TYjyaglxxVO> tYjyaglxxDTO
     */
    IPage<TYjyaglxxVO> queryPage(Page<TYjyaglxxDTO> page, TYjyaglxxDTO tYjyaglxxDTO);

    /**
     * 查询所有数据
     *
     * @param tYjyaglxxDTO 查询参数
     * @return List<TYjyaglxxVO>
     */
    List<TYjyaglxxVO> queryList(TYjyaglxxDTO tYjyaglxxDTO);
}
