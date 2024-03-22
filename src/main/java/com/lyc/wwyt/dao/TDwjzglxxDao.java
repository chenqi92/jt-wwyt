package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.dto.TDwjzglxxDTO;
import com.lyc.wwyt.entity.TDwjzglxxEntity;
import com.lyc.wwyt.vo.TDwjzglxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 定位基站管理信息表(t_dwjzglxx)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-22 14:16:23
 */
@Mapper
public interface TDwjzglxxDao extends BaseMapper<TDwjzglxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDwjzglxxDTO 查询参数
     * @return IPage<TDwjzglxxVO>
     */
    IPage<TDwjzglxxVO> queryList(Page<TDwjzglxxDTO> page, @Param("tDwjzglxxDTO") TDwjzglxxDTO tDwjzglxxDTO);

    /**
     * 查询所有数据
     *
     * @param tDwjzglxxDTO 查询参数
     * @return List<TDwjzglxxVO>
     */
    List<TDwjzglxxVO> queryList(@Param("tDwjzglxxDTO") TDwjzglxxDTO tDwjzglxxDTO);
}
