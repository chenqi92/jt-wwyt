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
 * @since 2023-05-22 14:22:33
 */
public interface TScssbyxxService extends IService<TScssbyxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tScssbyxxDTO 查询参数
     * @return IPage<TScssbyxxVO> tScssbyxxDTO
     */
    IPage<TScssbyxxVO> queryPage(Page<TScssbyxxDTO> page, TScssbyxxDTO tScssbyxxDTO);

    /**
     * 查询所有数据
     *
     * @param tScssbyxxDTO 查询参数
     * @return List<TScssbyxxVO>
     */
    List<TScssbyxxVO> queryList(TScssbyxxDTO tScssbyxxDTO);
}
