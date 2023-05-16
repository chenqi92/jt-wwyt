package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TYjwzglxxEntity;
import com.lyc.wwyt.dto.TYjwzglxxDTO;
import com.lyc.wwyt.vo.TYjwzglxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 应急物资管理信息表(t_yjwzglxx)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-16 16:33:58
 */
@Mapper
public interface TYjwzglxxDao extends BaseMapper<TYjwzglxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TYjwzglxxVO>
     */
    List<TYjwzglxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tYjwzglxxDTO 查询参数
     * @return IPage<TYjwzglxxVO>
     */
    IPage<TYjwzglxxVO> selectList(Page<TYjwzglxxDTO> page, @Param("tYjwzglxxDTO") TYjwzglxxDTO tYjwzglxxDTO);
}
