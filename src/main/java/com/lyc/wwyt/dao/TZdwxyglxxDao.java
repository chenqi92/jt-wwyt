package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TZdwxyglxxEntity;
import com.lyc.wwyt.dto.TZdwxyglxxDTO;
import com.lyc.wwyt.vo.TZdwxyglxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 重大危险源管理信息表(t_zdwxyglxx)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-17 14:04:25
 */
@Mapper
public interface TZdwxyglxxDao extends BaseMapper<TZdwxyglxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TZdwxyglxxVO>
     */
    List<TZdwxyglxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page          分页参数
     * @param tZdwxyglxxDTO 查询参数
     * @return IPage<TZdwxyglxxVO>
     */
    IPage<TZdwxyglxxVO> selectList(Page<TZdwxyglxxDTO> page, @Param("tZdwxyglxxDTO") TZdwxyglxxDTO tZdwxyglxxDTO);
}
