package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TMbcdzySplzEntity;
import com.lyc.wwyt.dto.TMbcdzySplzDTO;
import com.lyc.wwyt.vo.TMbcdzySplzVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 盲板抽堵作业审批流转记录表(t_mbcdzy_splz)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-18 15:55:08
 */
@Mapper
public interface TMbcdzySplzDao extends BaseMapper<TMbcdzySplzEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TMbcdzySplzVO>
     */
    List<TMbcdzySplzVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tMbcdzySplzDTO 查询参数
     * @return IPage<TMbcdzySplzVO>
     */
    IPage<TMbcdzySplzVO> selectList(Page<TMbcdzySplzDTO> page, @Param("tMbcdzySplzDTO") TMbcdzySplzDTO tMbcdzySplzDTO);
}
