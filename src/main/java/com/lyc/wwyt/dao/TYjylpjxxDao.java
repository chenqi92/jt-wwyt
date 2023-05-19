package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TYjylpjxxEntity;
import com.lyc.wwyt.dto.TYjylpjxxDTO;
import com.lyc.wwyt.vo.TYjylpjxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 应急演练评价表（t_yjylpjxx）(t_yjylpjxx)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-19 14:56:47
 */
@Mapper
public interface TYjylpjxxDao extends BaseMapper<TYjylpjxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tYjylpjxxDTO 查询参数
     * @return IPage<TYjylpjxxVO>
     */
    IPage<TYjylpjxxVO> queryList(Page<TYjylpjxxDTO> page, @Param("tYjylpjxxDTO") TYjylpjxxDTO tYjylpjxxDTO);

    /**
     * 查询所有数据
     *
     * @param tYjylpjxxDTO 查询参数
     * @return List<TYjylpjxxVO>
     */
    List<TYjylpjxxVO> queryList(@Param("tYjylpjxxDTO") TYjylpjxxDTO tYjylpjxxDTO);
}
