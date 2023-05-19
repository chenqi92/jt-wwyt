package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TCbswzjlxxEntity;
import com.lyc.wwyt.dto.TCbswzjlxxDTO;
import com.lyc.wwyt.vo.TCbswzjlxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 承包商违章记录信息表(t_cbswzjlxx)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-19 14:56:51
 */
@Mapper
public interface TCbswzjlxxDao extends BaseMapper<TCbswzjlxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page          分页参数
     * @param tCbswzjlxxDTO 查询参数
     * @return IPage<TCbswzjlxxVO>
     */
    IPage<TCbswzjlxxVO> queryList(Page<TCbswzjlxxDTO> page, @Param("tCbswzjlxxDTO") TCbswzjlxxDTO tCbswzjlxxDTO);

    /**
     * 查询所有数据
     *
     * @param tCbswzjlxxDTO 查询参数
     * @return List<TCbswzjlxxVO>
     */
    List<TCbswzjlxxVO> queryList(@Param("tCbswzjlxxDTO") TCbswzjlxxDTO tCbswzjlxxDTO);
}
