package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.dto.TZycswxyshwpwxwhtxyzkxxDTO;
import com.lyc.wwyt.entity.TZycswxyshwpwxwhtxyzkxxEntity;
import com.lyc.wwyt.vo.TZycswxyshwpwxwhtxyzkxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 作业场所岗位风险应知卡信息表(t_zycswxyshwpwxwhtxyzkxx)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-19 14:56:50
 */
@Mapper
public interface TZycswxyshwpwxwhtxyzkxxDao extends BaseMapper<TZycswxyshwpwxwhtxyzkxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page                       分页参数
     * @param tZycswxyshwpwxwhtxyzkxxDTO 查询参数
     * @return IPage<TZycswxyshwpwxwhtxyzkxxVO>
     */
    IPage<TZycswxyshwpwxwhtxyzkxxVO> queryList(Page<TZycswxyshwpwxwhtxyzkxxDTO> page, @Param("tZycswxyshwpwxwhtxyzkxxDTO") TZycswxyshwpwxwhtxyzkxxDTO tZycswxyshwpwxwhtxyzkxxDTO);

    /**
     * 查询所有数据
     *
     * @param tZycswxyshwpwxwhtxyzkxxDTO 查询参数
     * @return List<TZycswxyshwpwxwhtxyzkxxVO>
     */
    List<TZycswxyshwpwxwhtxyzkxxVO> queryList(@Param("tZycswxyshwpwxwhtxyzkxxDTO") TZycswxyshwpwxwhtxyzkxxDTO tZycswxyshwpwxwhtxyzkxxDTO);
}
