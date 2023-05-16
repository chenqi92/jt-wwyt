package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TZycswxyshwpwxwhtxyzkxxEntity;
import com.lyc.wwyt.dto.TZycswxyshwpwxwhtxyzkxxDTO;
import com.lyc.wwyt.vo.TZycswxyshwpwxwhtxyzkxxVO;

import java.util.List;

/**
 * 作业场所岗位风险应知卡信息表(t_zycswxyshwpwxwhtxyzkxx)表服务接口
 *
 * @author chenqi
 * @since 2023-05-16 16:33:46
 */
public interface TZycswxyshwpwxwhtxyzkxxService extends IService<TZycswxyshwpwxwhtxyzkxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TZycswxyshwpwxwhtxyzkxxVO>
     */
    List<TZycswxyshwpwxwhtxyzkxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page                       分页参数
     * @param tZycswxyshwpwxwhtxyzkxxDTO 查询参数
     * @return IPage<TZycswxyshwpwxwhtxyzkxxVO> tZycswxyshwpwxwhtxyzkxxDTO
     */
    IPage<TZycswxyshwpwxwhtxyzkxxVO> selectPage(Page<TZycswxyshwpwxwhtxyzkxxDTO> page, TZycswxyshwpwxwhtxyzkxxDTO tZycswxyshwpwxwhtxyzkxxDTO);
}
