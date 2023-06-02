package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.dto.TCbssgglxxDTO;
import com.lyc.wwyt.entity.TCbssgglxxEntity;
import com.lyc.wwyt.vo.TCbssgglxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 承包商施工管理信息表(t_cbssgglxx)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-19 14:56:43
 */
@Mapper
public interface TCbssgglxxDao extends BaseMapper<TCbssgglxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page          分页参数
     * @param tCbssgglxxDTO 查询参数
     * @return IPage<TCbssgglxxVO>
     */
    IPage<TCbssgglxxVO> queryList(Page<TCbssgglxxDTO> page, @Param("tCbssgglxxDTO") TCbssgglxxDTO tCbssgglxxDTO);

    /**
     * 查询所有数据
     *
     * @param tCbssgglxxDTO 查询参数
     * @return List<TCbssgglxxVO>
     */
    List<TCbssgglxxVO> queryList(@Param("tCbssgglxxDTO") TCbssgglxxDTO tCbssgglxxDTO);
}
