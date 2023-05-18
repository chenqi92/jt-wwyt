package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TDtzySplzEntity;
import com.lyc.wwyt.dto.TDtzySplzDTO;
import com.lyc.wwyt.vo.TDtzySplzVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 动土作业审批流转记录表(t_dtzy_splz)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-18 15:54:37
 */
@Mapper
public interface TDtzySplzDao extends BaseMapper<TDtzySplzEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TDtzySplzVO>
     */
    List<TDtzySplzVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDtzySplzDTO 查询参数
     * @return IPage<TDtzySplzVO>
     */
    IPage<TDtzySplzVO> selectList(Page<TDtzySplzDTO> page, @Param("tDtzySplzDTO") TDtzySplzDTO tDtzySplzDTO);
}
