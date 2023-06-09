package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.dto.CmUnitDTO;
import com.lyc.wwyt.entity.CmUnitEntity;
import com.lyc.wwyt.vo.CmUnitVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (cm_unit)表数据库访问层
 *
 * @author chenqi
 * @since 2023-06-02 14:06:06
 */
@Mapper
public interface CmUnitDao extends BaseMapper<CmUnitEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page      分页参数
     * @param cmUnitDTO 查询参数
     * @return IPage<CmUnitVO>
     */
    IPage<CmUnitVO> queryList(Page<CmUnitDTO> page, @Param("cmUnitDTO") CmUnitDTO cmUnitDTO);

    /**
     * 查询所有数据
     *
     * @param cmUnitDTO 查询参数
     * @return List<CmUnitVO>
     */
    List<CmUnitVO> queryList(@Param("cmUnitDTO") CmUnitDTO cmUnitDTO);
}
