package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TScqyxxEntity;
import com.lyc.wwyt.dto.TScqyxxDTO;
import com.lyc.wwyt.vo.TScqyxxVO;

import java.util.List;

/**
 * 生产区域信息表(t_scqyxx)表服务接口
 *
 * @author lhh
 * @since 2023-05-17 17:22:12
 */
public interface TScqyxxService extends IService<TScqyxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TScqyxxVO>
     */
    List<TScqyxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tScqyxxDTO 查询参数
     * @return IPage<TScqyxxVO> tScqyxxDTO
     */
    IPage<TScqyxxVO> selectPage(Page<TScqyxxDTO> page, TScqyxxDTO tScqyxxDTO);
}
