package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TQyryxxEntity;
import com.lyc.wwyt.dto.TQyryxxDTO;
import com.lyc.wwyt.vo.TQyryxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 企业人员信息表(t_qyryxx)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-17 11:20:41
 */
@Mapper
public interface TQyryxxDao extends BaseMapper<TQyryxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TQyryxxVO>
     */
    List<TQyryxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tQyryxxDTO 查询参数
     * @return IPage<TQyryxxVO>
     */
    IPage<TQyryxxVO> selectList(Page<TQyryxxDTO> page, @Param("tQyryxxDTO") TQyryxxDTO tQyryxxDTO);
}
