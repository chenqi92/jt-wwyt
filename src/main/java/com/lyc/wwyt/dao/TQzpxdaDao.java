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
 * @since 2023-05-16 16:33:56
 */
@Mapper
public interface TQzpxdaDao extends BaseMapper<TQzpxdaEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TQzpxdaVO>
     */
    List<TQzpxdaVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tQzpxdaDTO 查询参数
     * @return IPage<TQzpxdaVO>
     */
    IPage<TQzpxdaVO> selectList(Page<TQzpxdaDTO> page, @Param("tQzpxdaDTO") TQzpxdaDTO tQzpxdaDTO);
}
