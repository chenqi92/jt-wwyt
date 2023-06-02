package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.dto.TJcbwhxxDTO;
import com.lyc.wwyt.entity.TJcbwhxxEntity;
import com.lyc.wwyt.vo.TJcbwhxxVO;

import java.util.List;

/**
 * 安全检查表维护信息表结构(t_jcbwhxx)表服务接口
 *
 * @author chenqi
 * @since 2023-05-19 14:56:50
 */
public interface TJcbwhxxService extends IService<TJcbwhxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page        分页参数
     * @param tJcbwhxxDTO 查询参数
     * @return IPage<TJcbwhxxVO> tJcbwhxxDTO
     */
    IPage<TJcbwhxxVO> queryPage(Page<TJcbwhxxDTO> page, TJcbwhxxDTO tJcbwhxxDTO);

    /**
     * 查询所有数据
     *
     * @param tJcbwhxxDTO 查询参数
     * @return List<TJcbwhxxVO>
     */
    List<TJcbwhxxVO> queryList(TJcbwhxxDTO tJcbwhxxDTO);
}
