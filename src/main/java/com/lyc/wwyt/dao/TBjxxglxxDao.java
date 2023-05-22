package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TBjxxglxxEntity;
import com.lyc.wwyt.dto.TBjxxglxxDTO;
import com.lyc.wwyt.vo.TBjxxglxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 报警信息管理信息表(t_bjxxglxx)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-22 14:13:06
 */
@Mapper
public interface TBjxxglxxDao extends BaseMapper<TBjxxglxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tBjxxglxxDTO 查询参数
     * @return IPage<TBjxxglxxVO>
     */
    IPage<TBjxxglxxVO> queryList(Page<TBjxxglxxDTO> page, @Param("tBjxxglxxDTO") TBjxxglxxDTO tBjxxglxxDTO);

    /**
     * 查询所有数据
     *
     * @param tBjxxglxxDTO 查询参数
     * @return List<TBjxxglxxVO>
     */
    List<TBjxxglxxVO> queryList(@Param("tBjxxglxxDTO") TBjxxglxxDTO tBjxxglxxDTO);
}
