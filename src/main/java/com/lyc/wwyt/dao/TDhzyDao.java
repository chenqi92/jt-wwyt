package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TDhzyEntity;
import com.lyc.wwyt.dto.TDhzyDTO;
import com.lyc.wwyt.vo.TDhzyVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 动火作业信息表(t_dhzy)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-18 15:54:18
 */
@Mapper
public interface TDhzyDao extends BaseMapper<TDhzyEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TDhzyVO>
     */
    List<TDhzyVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page     分页参数
     * @param tDhzyDTO 查询参数
     * @return IPage<TDhzyVO>
     */
    IPage<TDhzyVO> selectList(Page<TDhzyDTO> page, @Param("tDhzyDTO") TDhzyDTO tDhzyDTO);
}
