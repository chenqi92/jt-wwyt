package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TDwjcxxEntity;
import com.lyc.wwyt.dto.TDwjcxxDTO;
import com.lyc.wwyt.vo.TDwjcxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 点位检查信息表(t_dwjcxx)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-22 14:16:22
 */
@Mapper
public interface TDwjcxxDao extends BaseMapper<TDwjcxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tDwjcxxDTO 查询参数
     * @return IPage<TDwjcxxVO>
     */
    IPage<TDwjcxxVO> queryList(Page<TDwjcxxDTO> page, @Param("tDwjcxxDTO") TDwjcxxDTO tDwjcxxDTO);

    /**
     * 查询所有数据
     *
     * @param tDwjcxxDTO 查询参数
     * @return List<TDwjcxxVO>
     */
    List<TDwjcxxVO> queryList(@Param("tDwjcxxDTO") TDwjcxxDTO tDwjcxxDTO);
}
