package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TYhzlxxEntity;
import com.lyc.wwyt.dto.TYhzlxxDTO;
import com.lyc.wwyt.vo.TYhzlxxVO;

import java.util.List;

/**
 * 隐患治理信息表(t_yhzlxx)表服务接口
 *
 * @author chenqi
 * @since 2023-05-16 16:33:45
 */
public interface TYhzlxxService extends IService<TYhzlxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TYhzlxxVO>
     */
    List<TYhzlxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tYhzlxxDTO 查询参数
     * @return IPage<TYhzlxxVO> tYhzlxxDTO
     */
    IPage<TYhzlxxVO> selectPage(Page<TYhzlxxDTO> page, TYhzlxxDTO tYhzlxxDTO);
}
