package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.dto.TYhzlxxDTO;
import com.lyc.wwyt.entity.TYhzlxxEntity;
import com.lyc.wwyt.vo.TYhzlxxVO;

import java.util.List;

/**
 * 隐患治理信息表(t_yhzlxx)表服务接口
 *
 * @author chenqi
 * @since 2023-05-19 14:56:41
 */
public interface TYhzlxxService extends IService<TYhzlxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tYhzlxxDTO 查询参数
     * @return IPage<TYhzlxxVO> tYhzlxxDTO
     */
    IPage<TYhzlxxVO> queryPage(Page<TYhzlxxDTO> page, TYhzlxxDTO tYhzlxxDTO);

    /**
     * 查询所有数据
     *
     * @param tYhzlxxDTO 查询参数
     * @return List<TYhzlxxVO>
     */
    List<TYhzlxxVO> queryList(TYhzlxxDTO tYhzlxxDTO);
}
