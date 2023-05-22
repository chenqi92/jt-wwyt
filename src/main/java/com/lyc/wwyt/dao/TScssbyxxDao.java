package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TScssbyxxEntity;
import com.lyc.wwyt.dto.TScssbyxxDTO;
import com.lyc.wwyt.vo.TScssbyxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 生产设施保养信息(t_scssbyxx)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-22 14:22:33
 */
@Mapper
public interface TScssbyxxDao extends BaseMapper<TScssbyxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tScssbyxxDTO 查询参数
     * @return IPage<TScssbyxxVO>
     */
    IPage<TScssbyxxVO> queryList(Page<TScssbyxxDTO> page, @Param("tScssbyxxDTO") TScssbyxxDTO tScssbyxxDTO);

    /**
     * 查询所有数据
     *
     * @param tScssbyxxDTO 查询参数
     * @return List<TScssbyxxVO>
     */
    List<TScssbyxxVO> queryList(@Param("tScssbyxxDTO") TScssbyxxDTO tScssbyxxDTO);
}
