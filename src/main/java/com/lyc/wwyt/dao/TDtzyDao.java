package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TDtzyEntity;
import com.lyc.wwyt.dto.TDtzyDTO;
import com.lyc.wwyt.vo.TDtzyVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 动土作业信息表(t_dtzy)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-18 15:54:33
 */
@Mapper
public interface TDtzyDao extends BaseMapper<TDtzyEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TDtzyVO>
     */
    List<TDtzyVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page     分页参数
     * @param tDtzyDTO 查询参数
     * @return IPage<TDtzyVO>
     */
    IPage<TDtzyVO> selectList(Page<TDtzyDTO> page, @Param("tDtzyDTO") TDtzyDTO tDtzyDTO);
}
