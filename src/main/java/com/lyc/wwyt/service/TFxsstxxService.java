package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TFxsstxxEntity;
import com.lyc.wwyt.dto.TFxsstxxDTO;
import com.lyc.wwyt.vo.TFxsstxxVO;

import java.util.List;

/**
 * 风险四色图信息表(t_fxsstxx)表服务接口
 *
 * @author chenqi
 * @since 2023-05-17 16:22:44
 */
public interface TFxsstxxService extends IService<TFxsstxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page        分页参数
     * @param tFxsstxxDTO 查询参数
     * @return IPage<TFxsstxxVO> tFxsstxxDTO
     */
    IPage<TFxsstxxVO> queryPage(Page<TFxsstxxDTO> page, TFxsstxxDTO tFxsstxxDTO);

    /**
     * 查询所有数据
     *
     * @param tFxsstxxDTO 查询参数
     * @return List<TFxsstxxVO>
     */
    List<TFxsstxxVO> queryList(TFxsstxxDTO tFxsstxxDTO);
}
