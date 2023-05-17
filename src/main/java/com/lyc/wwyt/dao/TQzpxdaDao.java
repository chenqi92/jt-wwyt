package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TQzpxdaEntity;
import com.lyc.wwyt.dto.TQzpxdaDTO;
import com.lyc.wwyt.vo.TQzpxdaVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 取证培训档案表(t_qzpxda)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-17 16:22:45
 */
@Mapper
public interface TQzpxdaDao extends BaseMapper<TQzpxdaEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tQzpxdaDTO 查询参数
     * @return IPage<TQzpxdaVO>
     */
    IPage<TQzpxdaVO> queryList(Page<TQzpxdaDTO> page, @Param("tQzpxdaDTO") TQzpxdaDTO tQzpxdaDTO);

    /**
     * 查询所有数据
     *
     * @param tQzpxdaDTO 查询参数
     * @return List<TQzpxdaVO>
     */
    List<TQzpxdaVO> queryList(@Param("tQzpxdaDTO") TQzpxdaDTO tQzpxdaDTO);
}
