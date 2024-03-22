package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.dto.TDtzyDTO;
import com.lyc.wwyt.entity.TDtzyEntity;
import com.lyc.wwyt.vo.TDtzyVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 动土作业信息表(t_dtzy)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-22 14:13:41
 */
@Mapper
public interface TDtzyDao extends BaseMapper<TDtzyEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page     分页参数
     * @param tDtzyDTO 查询参数
     * @return IPage<TDtzyVO>
     */
    IPage<TDtzyVO> queryList(Page<TDtzyDTO> page, @Param("tDtzyDTO") TDtzyDTO tDtzyDTO);

    /**
     * 查询所有数据
     *
     * @param tDtzyDTO 查询参数
     * @return List<TDtzyVO>
     */
    List<TDtzyVO> queryList(@Param("tDtzyDTO") TDtzyDTO tDtzyDTO);
}
