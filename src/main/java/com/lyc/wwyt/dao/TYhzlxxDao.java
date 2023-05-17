package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TYhzlxxEntity;
import com.lyc.wwyt.dto.TYhzlxxDTO;
import com.lyc.wwyt.vo.TYhzlxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 隐患治理信息表(t_yhzlxx)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-16 16:33:45
 */
@Mapper
public interface TYhzlxxDao extends BaseMapper<TYhzlxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TYhzlxxVO>
     */
    List<TYhzlxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tYhzlxxDTO 查询参数
     * @return IPage<TYhzlxxVO>
     */
    IPage<TYhzlxxVO> selectList(Page<TYhzlxxDTO> page, @Param("tYhzlxxDTO") TYhzlxxDTO tYhzlxxDTO);
}
