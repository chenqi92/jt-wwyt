package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.dto.TDlzyDTO;
import com.lyc.wwyt.entity.TDlzyEntity;
import com.lyc.wwyt.vo.TDlzyVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 断路作业信息表(t_dlzy)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-22 14:13:40
 */
@Mapper
public interface TDlzyDao extends BaseMapper<TDlzyEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page     分页参数
     * @param tDlzyDTO 查询参数
     * @return IPage<TDlzyVO>
     */
    IPage<TDlzyVO> queryList(Page<TDlzyDTO> page, @Param("tDlzyDTO") TDlzyDTO tDlzyDTO);

    /**
     * 查询所有数据
     *
     * @param tDlzyDTO 查询参数
     * @return List<TDlzyVO>
     */
    List<TDlzyVO> queryList(@Param("tDlzyDTO") TDlzyDTO tDlzyDTO);
}
