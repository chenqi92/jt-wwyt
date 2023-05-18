package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TDwszxxEntity;
import com.lyc.wwyt.dto.TDwszxxDTO;
import com.lyc.wwyt.vo.TDwszxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 点位设置信息表(t_dwszxx)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-17 17:22:12
 */
@Mapper
public interface TDwszxxDao extends BaseMapper<TDwszxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TDwszxxVO>
     */
    List<TDwszxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tDwszxxDTO 查询参数
     * @return IPage<TDwszxxVO>
     */
    IPage<TDwszxxVO> selectList(Page<TDwszxxDTO> page, @Param("tDwszxxDTO") TDwszxxDTO tDwszxxDTO);
}
