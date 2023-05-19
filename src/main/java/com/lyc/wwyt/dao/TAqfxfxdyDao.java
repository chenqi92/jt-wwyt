package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TAqfxfxdyEntity;
import com.lyc.wwyt.dto.TAqfxfxdyDTO;
import com.lyc.wwyt.vo.TAqfxfxdyVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 安全风险分析单元表(t_aqfxfxdy)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-19 14:56:40
 */
@Mapper
public interface TAqfxfxdyDao extends BaseMapper<TAqfxfxdyEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tAqfxfxdyDTO 查询参数
     * @return IPage<TAqfxfxdyVO>
     */
    IPage<TAqfxfxdyVO> queryList(Page<TAqfxfxdyDTO> page, @Param("tAqfxfxdyDTO") TAqfxfxdyDTO tAqfxfxdyDTO);

    /**
     * 查询所有数据
     *
     * @param tAqfxfxdyDTO 查询参数
     * @return List<TAqfxfxdyVO>
     */
    List<TAqfxfxdyVO> queryList(@Param("tAqfxfxdyDTO") TAqfxfxdyDTO tAqfxfxdyDTO);
}
