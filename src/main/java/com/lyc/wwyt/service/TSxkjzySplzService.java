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
 * @since 2023-05-22 14:22:38
 */
public interface TSxkjzySplzService extends IService<TSxkjzySplzEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tSxkjzySplzDTO 查询参数
     * @return IPage<TSxkjzySplzVO> tSxkjzySplzDTO
     */
    IPage<TSxkjzySplzVO> queryPage(Page<TSxkjzySplzDTO> page, TSxkjzySplzDTO tSxkjzySplzDTO);

    /**
     * 查询所有数据
     *
     * @param tSxkjzySplzDTO 查询参数
     * @return List<TSxkjzySplzVO>
     */
    List<TSxkjzySplzVO> queryList(TSxkjzySplzDTO tSxkjzySplzDTO);
}
