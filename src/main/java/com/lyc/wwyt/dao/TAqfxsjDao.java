package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TAqfxsjEntity;
import com.lyc.wwyt.dto.TAqfxsjDTO;
import com.lyc.wwyt.vo.TAqfxsjVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 安全风险事件表(t_aqfxsj)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-17 16:22:39
 */
@Mapper
public interface TAqfxsjDao extends BaseMapper<TAqfxsjEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tAqfxsjDTO 查询参数
     * @return IPage<TAqfxsjVO>
     */
    IPage<TAqfxsjVO> queryList(Page<TAqfxsjDTO> page, @Param("tAqfxsjDTO") TAqfxsjDTO tAqfxsjDTO);

    /**
     * 查询所有数据
     *
     * @param tAqfxsjDTO 查询参数
     * @return List<TAqfxsjVO>
     */
    List<TAqfxsjVO> queryList(@Param("tAqfxsjDTO") TAqfxsjDTO tAqfxsjDTO);
}
