package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.dto.TPxjhxxDTO;
import com.lyc.wwyt.entity.TPxjhxxEntity;
import com.lyc.wwyt.vo.TPxjhxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 培训计划信息表(t_pxjhxx)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-19 14:56:49
 */
@Mapper
public interface TPxjhxxDao extends BaseMapper<TPxjhxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tPxjhxxDTO 查询参数
     * @return IPage<TPxjhxxVO>
     */
    IPage<TPxjhxxVO> queryList(Page<TPxjhxxDTO> page, @Param("tPxjhxxDTO") TPxjhxxDTO tPxjhxxDTO);

    /**
     * 查询所有数据
     *
     * @param tPxjhxxDTO 查询参数
     * @return List<TPxjhxxVO>
     */
    List<TPxjhxxVO> queryList(@Param("tPxjhxxDTO") TPxjhxxDTO tPxjhxxDTO);
}
