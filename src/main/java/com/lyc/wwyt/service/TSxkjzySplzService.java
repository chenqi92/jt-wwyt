package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TSxkjzySplzEntity;
import com.lyc.wwyt.dto.TSxkjzySplzDTO;
import com.lyc.wwyt.vo.TSxkjzySplzVO;

import java.util.List;

/**
 * 受限空间作业审批流转记录表(t_sxkjzy_splz)表服务接口
 *
 * @author lhh
 * @since 2023-05-18 15:55:17
 */
public interface TSxkjzySplzService extends IService<TSxkjzySplzEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TSxkjzySplzVO>
     */
    List<TSxkjzySplzVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tSxkjzySplzDTO 查询参数
     * @return IPage<TSxkjzySplzVO> tSxkjzySplzDTO
     */
    IPage<TSxkjzySplzVO> selectPage(Page<TSxkjzySplzDTO> page, TSxkjzySplzDTO tSxkjzySplzDTO);
}
