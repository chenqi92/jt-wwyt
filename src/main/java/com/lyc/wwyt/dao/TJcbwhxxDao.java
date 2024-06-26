package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.dto.TJcbwhxxDTO;
import com.lyc.wwyt.entity.TJcbwhxxEntity;
import com.lyc.wwyt.vo.TJcbwhxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 安全检查表维护信息表结构(t_jcbwhxx)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-19 14:56:50
 */
@Mapper
public interface TJcbwhxxDao extends BaseMapper<TJcbwhxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page        分页参数
     * @param tJcbwhxxDTO 查询参数
     * @return IPage<TJcbwhxxVO>
     */
    IPage<TJcbwhxxVO> queryList(Page<TJcbwhxxDTO> page, @Param("tJcbwhxxDTO") TJcbwhxxDTO tJcbwhxxDTO);

    /**
     * 查询所有数据
     *
     * @param tJcbwhxxDTO 查询参数
     * @return List<TJcbwhxxVO>
     */
    List<TJcbwhxxVO> queryList(@Param("tJcbwhxxDTO") TJcbwhxxDTO tJcbwhxxDTO);
}
