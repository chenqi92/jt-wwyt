package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TScssxxEntity;
import com.lyc.wwyt.dto.TScssxxDTO;
import com.lyc.wwyt.vo.TScssxxVO;

import java.util.List;

/**
 * 生产设施信息表(t_scssxx)表服务接口
 *
 * @author lhh
 * @since 2023-05-17 17:22:12
 */
public interface TScssxxService extends IService<TScssxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TScssxxVO>
     */
    List<TScssxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tScssxxDTO 查询参数
     * @return IPage<TScssxxVO> tScssxxDTO
     */
    IPage<TScssxxVO> selectPage(Page<TScssxxDTO> page, TScssxxDTO tScssxxDTO);
}
