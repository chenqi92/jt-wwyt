package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.dto.TYjczkxxDTO;
import com.lyc.wwyt.entity.TYjczkxxEntity;
import com.lyc.wwyt.vo.TYjczkxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 应急处置卡信息表：t_yjczkxx(t_yjczkxx)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-19 14:56:41
 */
@Mapper
public interface TYjczkxxDao extends BaseMapper<TYjczkxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page        分页参数
     * @param tYjczkxxDTO 查询参数
     * @return IPage<TYjczkxxVO>
     */
    IPage<TYjczkxxVO> queryList(Page<TYjczkxxDTO> page, @Param("tYjczkxxDTO") TYjczkxxDTO tYjczkxxDTO);

    /**
     * 查询所有数据
     *
     * @param tYjczkxxDTO 查询参数
     * @return List<TYjczkxxVO>
     */
    List<TYjczkxxVO> queryList(@Param("tYjczkxxDTO") TYjczkxxDTO tYjczkxxDTO);
}
