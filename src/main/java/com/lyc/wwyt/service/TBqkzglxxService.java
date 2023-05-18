package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TBqkzglxxEntity;
import com.lyc.wwyt.dto.TBqkzglxxDTO;
import com.lyc.wwyt.vo.TBqkzglxxVO;

import java.util.List;

/**
 * 标签扩展管理信息表(t_bqkzglxx)表服务接口
 *
 * @author lhh
 * @since 2023-05-18 16:32:20
 */
public interface TBqkzglxxService extends IService<TBqkzglxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TBqkzglxxVO>
     */
    List<TBqkzglxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tBqkzglxxDTO 查询参数
     * @return IPage<TBqkzglxxVO> tBqkzglxxDTO
     */
    IPage<TBqkzglxxVO> selectPage(Page<TBqkzglxxDTO> page, TBqkzglxxDTO tBqkzglxxDTO);
}
