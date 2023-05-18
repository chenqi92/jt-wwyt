package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TGczyEntity;
import com.lyc.wwyt.dto.TGczyDTO;
import com.lyc.wwyt.vo.TGczyVO;

import java.util.List;

/**
 * 高处作业信息表(t_gczy)表服务接口
 *
 * @author lhh
 * @since 2023-05-18 15:54:47
 */
public interface TGczyService extends IService<TGczyEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TGczyVO>
     */
    List<TGczyVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page     分页参数
     * @param tGczyDTO 查询参数
     * @return IPage<TGczyVO> tGczyDTO
     */
    IPage<TGczyVO> selectPage(Page<TGczyDTO> page, TGczyDTO tGczyDTO);
}
