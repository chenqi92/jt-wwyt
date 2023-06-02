package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.dto.TGjzzzdbwxxDTO;
import com.lyc.wwyt.entity.TGjzzzdbwxxEntity;
import com.lyc.wwyt.vo.TGjzzzdbwxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 关键装置重点部位信息表(t_gjzzzdbwxx)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-22 14:16:27
 */
@Mapper
public interface TGjzzzdbwxxDao extends BaseMapper<TGjzzzdbwxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tGjzzzdbwxxDTO 查询参数
     * @return IPage<TGjzzzdbwxxVO>
     */
    IPage<TGjzzzdbwxxVO> queryList(Page<TGjzzzdbwxxDTO> page, @Param("tGjzzzdbwxxDTO") TGjzzzdbwxxDTO tGjzzzdbwxxDTO);

    /**
     * 查询所有数据
     *
     * @param tGjzzzdbwxxDTO 查询参数
     * @return List<TGjzzzdbwxxVO>
     */
    List<TGjzzzdbwxxVO> queryList(@Param("tGjzzzdbwxxDTO") TGjzzzdbwxxDTO tGjzzzdbwxxDTO);
}
