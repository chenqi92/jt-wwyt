package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TPxzlxxEntity;
import com.lyc.wwyt.dto.TPxzlxxDTO;
import com.lyc.wwyt.vo.TPxzlxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 培训资料信息表(t_pxzlxx)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-19 14:56:49
 */
@Mapper
public interface TPxzlxxDao extends BaseMapper<TPxzlxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tPxzlxxDTO 查询参数
     * @return IPage<TPxzlxxVO>
     */
    IPage<TPxzlxxVO> queryList(Page<TPxzlxxDTO> page, @Param("tPxzlxxDTO") TPxzlxxDTO tPxzlxxDTO);

    /**
     * 查询所有数据
     *
     * @param tPxzlxxDTO 查询参数
     * @return List<TPxzlxxVO>
     */
    List<TPxzlxxVO> queryList(@Param("tPxzlxxDTO") TPxzlxxDTO tPxzlxxDTO);
}
