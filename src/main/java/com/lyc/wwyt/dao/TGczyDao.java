package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.dto.TGczyDTO;
import com.lyc.wwyt.entity.TGczyEntity;
import com.lyc.wwyt.vo.TGczyVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 高处作业信息表(t_gczy)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-22 14:16:25
 */
@Mapper
public interface TGczyDao extends BaseMapper<TGczyEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page     分页参数
     * @param tGczyDTO 查询参数
     * @return IPage<TGczyVO>
     */
    IPage<TGczyVO> queryList(Page<TGczyDTO> page, @Param("tGczyDTO") TGczyDTO tGczyDTO);

    /**
     * 查询所有数据
     *
     * @param tGczyDTO 查询参数
     * @return List<TGczyVO>
     */
    List<TGczyVO> queryList(@Param("tGczyDTO") TGczyDTO tGczyDTO);
}
