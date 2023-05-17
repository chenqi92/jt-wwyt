package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TAqfxgkcsEntity;
import com.lyc.wwyt.dto.TAqfxgkcsDTO;
import com.lyc.wwyt.vo.TAqfxgkcsVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 安全风险管控措施表结构(t_aqfxgkcs)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-17 16:22:38
 */
@Mapper
public interface TAqfxgkcsDao extends BaseMapper<TAqfxgkcsEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tAqfxgkcsDTO 查询参数
     * @return IPage<TAqfxgkcsVO>
     */
    IPage<TAqfxgkcsVO> queryList(Page<TAqfxgkcsDTO> page, @Param("tAqfxgkcsDTO") TAqfxgkcsDTO tAqfxgkcsDTO);

    /**
     * 查询所有数据
     *
     * @param tAqfxgkcsDTO 查询参数
     * @return List<TAqfxgkcsVO>
     */
    List<TAqfxgkcsVO> queryList(@Param("tAqfxgkcsDTO") TAqfxgkcsDTO tAqfxgkcsDTO);
}
