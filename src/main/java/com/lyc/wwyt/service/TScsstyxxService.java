package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.dto.TScsstyxxDTO;
import com.lyc.wwyt.entity.TScsstyxxEntity;
import com.lyc.wwyt.vo.TScsstyxxVO;

import java.util.List;

/**
 * 生产设施停用信息(t_scsstyxx)表服务接口
 *
 * @author lhh
 * @since 2023-05-22 14:22:36
 */
public interface TScsstyxxService extends IService<TScsstyxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tScsstyxxDTO 查询参数
     * @return IPage<TScsstyxxVO> tScsstyxxDTO
     */
    IPage<TScsstyxxVO> queryPage(Page<TScsstyxxDTO> page, TScsstyxxDTO tScsstyxxDTO);

    /**
     * 查询所有数据
     *
     * @param tScsstyxxDTO 查询参数
     * @return List<TScsstyxxVO>
     */
    List<TScsstyxxVO> queryList(TScsstyxxDTO tScsstyxxDTO);
}
