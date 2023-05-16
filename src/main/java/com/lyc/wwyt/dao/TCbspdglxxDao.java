package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TCbspdglxxEntity;
import com.lyc.wwyt.dto.TCbspdglxxDTO;
import com.lyc.wwyt.vo.TCbspdglxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 承包商评定管理信息表(t_cbspdglxx)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-16 16:33:48
 */
@Mapper
public interface TCbspdglxxDao extends BaseMapper<TCbspdglxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TCbspdglxxVO>
     */
    List<TCbspdglxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page          分页参数
     * @param tCbspdglxxDTO 查询参数
     * @return IPage<TCbspdglxxVO>
     */
    IPage<TCbspdglxxVO> selectList(Page<TCbspdglxxDTO> page, @Param("tCbspdglxxDTO") TCbspdglxxDTO tCbspdglxxDTO);
}
