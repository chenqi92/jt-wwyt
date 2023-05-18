package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TQyjcxxEntity;
import com.lyc.wwyt.dto.TQyjcxxDTO;
import com.lyc.wwyt.vo.TQyjcxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 企业基础信息表(t_qyjcxx)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-17 11:20:38
 */
@Mapper
public interface TQyjcxxDao extends BaseMapper<TQyjcxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TQyjcxxVO>
     */
    List<TQyjcxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tQyjcxxDTO 查询参数
     * @return IPage<TQyjcxxVO>
     */
    IPage<TQyjcxxVO> selectList(Page<TQyjcxxDTO> page, @Param("tQyjcxxDTO") TQyjcxxDTO tQyjcxxDTO);
}
