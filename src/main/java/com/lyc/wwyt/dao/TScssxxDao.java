package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.dto.TScssxxDTO;
import com.lyc.wwyt.entity.TScssxxEntity;
import com.lyc.wwyt.vo.TScssxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 生产设施信息表(t_scssxx)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-22 14:22:37
 */
@Mapper
public interface TScssxxDao extends BaseMapper<TScssxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tScssxxDTO 查询参数
     * @return IPage<TScssxxVO>
     */
    IPage<TScssxxVO> queryList(Page<TScssxxDTO> page, @Param("tScssxxDTO") TScssxxDTO tScssxxDTO);

    /**
     * 查询所有数据
     *
     * @param tScssxxDTO 查询参数
     * @return List<TScssxxVO>
     */
    List<TScssxxVO> queryList(@Param("tScssxxDTO") TScssxxDTO tScssxxDTO);
}
