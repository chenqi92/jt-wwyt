package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TScssbyxxEntity;
import com.lyc.wwyt.dto.TScssbyxxDTO;
import com.lyc.wwyt.vo.TScssbyxxVO;

import java.util.List;

/**
 * 生产设施保养信息(t_scssbyxx)表服务接口
 *
 * @author lhh
 * @since 2023-05-17 17:22:10
 */
public interface TScssbyxxService extends IService<TScssbyxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TScssbyxxVO>
     */
    List<TScssbyxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tScssbyxxDTO 查询参数
     * @return IPage<TScssbyxxVO> tScssbyxxDTO
     */
    IPage<TScssbyxxVO> selectPage(Page<TScssbyxxDTO> page, TScssbyxxDTO tScssbyxxDTO);
}
