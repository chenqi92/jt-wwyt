package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TScsstyxxEntity;
import com.lyc.wwyt.dto.TScsstyxxDTO;
import com.lyc.wwyt.vo.TScsstyxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 生产设施停用信息(t_scsstyxx)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-17 17:22:11
 */
@Mapper
public interface TScsstyxxDao extends BaseMapper<TScsstyxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TScsstyxxVO>
     */
    List<TScsstyxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tScsstyxxDTO 查询参数
     * @return IPage<TScsstyxxVO>
     */
    IPage<TScsstyxxVO> selectList(Page<TScsstyxxDTO> page, @Param("tScsstyxxDTO") TScsstyxxDTO tScsstyxxDTO);
}
