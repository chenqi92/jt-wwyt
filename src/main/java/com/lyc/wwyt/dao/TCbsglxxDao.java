package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.dto.TCbsglxxDTO;
import com.lyc.wwyt.entity.TCbsglxxEntity;
import com.lyc.wwyt.vo.TCbsglxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 承包商管理信息表(t_cbsglxx)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-12 15:32:04
 */
@Mapper
public interface TCbsglxxDao extends BaseMapper<TCbsglxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TCbsglxxVO>
     */
    List<TCbsglxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param cbsglxxDTO 查询参数
     * @return IPage<TCbsglxxVO>
     */
    IPage<TCbsglxxVO> selectList(Page<TCbsglxxDTO> page, @Param("cbsglxxDTO") TCbsglxxDTO cbsglxxDTO);

}
