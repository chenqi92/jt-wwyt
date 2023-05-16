package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TYjyaglxxEntity;
import com.lyc.wwyt.dto.TYjyaglxxDTO;
import com.lyc.wwyt.vo.TYjyaglxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 应急预案管理信息表(t_yjyaglxx)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-16 16:33:41
 */
@Mapper
public interface TYjyaglxxDao extends BaseMapper<TYjyaglxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TYjyaglxxVO>
     */
    List<TYjyaglxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tYjyaglxxDTO 查询参数
     * @return IPage<TYjyaglxxVO>
     */
    IPage<TYjyaglxxVO> selectList(Page<TYjyaglxxDTO> page, @Param("tYjyaglxxDTO") TYjyaglxxDTO tYjyaglxxDTO);
}
