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
 * @since 2023-05-22 14:22:37
 */
public interface TScssxxService extends IService<TScssxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tScssxxDTO 查询参数
     * @return IPage<TScssxxVO> tScssxxDTO
     */
    IPage<TScssxxVO> queryPage(Page<TScssxxDTO> page, TScssxxDTO tScssxxDTO);

    /**
     * 查询所有数据
     *
     * @param tScssxxDTO 查询参数
     * @return List<TScssxxVO>
     */
    List<TScssxxVO> queryList(TScssxxDTO tScssxxDTO);
}
