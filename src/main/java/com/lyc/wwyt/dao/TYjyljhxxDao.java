package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TYjyljhxxEntity;
import com.lyc.wwyt.dto.TYjyljhxxDTO;
import com.lyc.wwyt.vo.TYjyljhxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 应急演练计划信息表(t_yjyljhxx)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-16 16:33:41
 */
@Mapper
public interface TYjyljhxxDao extends BaseMapper<TYjyljhxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TYjyljhxxVO>
     */
    List<TYjyljhxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tYjyljhxxDTO 查询参数
     * @return IPage<TYjyljhxxVO>
     */
    IPage<TYjyljhxxVO> selectList(Page<TYjyljhxxDTO> page, @Param("tYjyljhxxDTO") TYjyljhxxDTO tYjyljhxxDTO);
}
