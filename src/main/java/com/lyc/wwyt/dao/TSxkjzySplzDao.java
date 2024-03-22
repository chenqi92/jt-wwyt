package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.dto.TSxkjzySplzDTO;
import com.lyc.wwyt.entity.TSxkjzySplzEntity;
import com.lyc.wwyt.vo.TSxkjzySplzVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 受限空间作业审批流转记录表(t_sxkjzy_splz)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-22 14:22:38
 */
@Mapper
public interface TSxkjzySplzDao extends BaseMapper<TSxkjzySplzEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tSxkjzySplzDTO 查询参数
     * @return IPage<TSxkjzySplzVO>
     */
    IPage<TSxkjzySplzVO> queryList(Page<TSxkjzySplzDTO> page, @Param("tSxkjzySplzDTO") TSxkjzySplzDTO tSxkjzySplzDTO);

    /**
     * 查询所有数据
     *
     * @param tSxkjzySplzDTO 查询参数
     * @return List<TSxkjzySplzVO>
     */
    List<TSxkjzySplzVO> queryList(@Param("tSxkjzySplzDTO") TSxkjzySplzDTO tSxkjzySplzDTO);
}
