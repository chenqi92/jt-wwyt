package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TYjdwglxxEntity;
import com.lyc.wwyt.dto.TYjdwglxxDTO;
import com.lyc.wwyt.vo.TYjdwglxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 应急队伍管理信息表(t_yjdwglxx)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-17 16:22:39
 */
@Mapper
public interface TYjdwglxxDao extends BaseMapper<TYjdwglxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tYjdwglxxDTO 查询参数
     * @return IPage<TYjdwglxxVO>
     */
    IPage<TYjdwglxxVO> queryList(Page<TYjdwglxxDTO> page, @Param("tYjdwglxxDTO") TYjdwglxxDTO tYjdwglxxDTO);

    /**
     * 查询所有数据
     *
     * @param tYjdwglxxDTO 查询参数
     * @return List<TYjdwglxxVO>
     */
    List<TYjdwglxxVO> queryList(@Param("tYjdwglxxDTO") TYjdwglxxDTO tYjdwglxxDTO);
}
