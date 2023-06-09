package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.dto.TYjyljhxxDTO;
import com.lyc.wwyt.entity.TYjyljhxxEntity;
import com.lyc.wwyt.vo.TYjyljhxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 应急演练计划信息表(t_yjyljhxx)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-19 14:56:43
 */
@Mapper
public interface TYjyljhxxDao extends BaseMapper<TYjyljhxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tYjyljhxxDTO 查询参数
     * @return IPage<TYjyljhxxVO>
     */
    IPage<TYjyljhxxVO> queryList(Page<TYjyljhxxDTO> page, @Param("tYjyljhxxDTO") TYjyljhxxDTO tYjyljhxxDTO);

    /**
     * 查询所有数据
     *
     * @param tYjyljhxxDTO 查询参数
     * @return List<TYjyljhxxVO>
     */
    List<TYjyljhxxVO> queryList(@Param("tYjyljhxxDTO") TYjyljhxxDTO tYjyljhxxDTO);
}
