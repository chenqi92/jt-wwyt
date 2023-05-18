package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TDlzyEntity;
import com.lyc.wwyt.dto.TDlzyDTO;
import com.lyc.wwyt.vo.TDlzyVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 断路作业信息表(t_dlzy)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-18 15:54:26
 */
@Mapper
public interface TDlzyDao extends BaseMapper<TDlzyEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TDlzyVO>
     */
    List<TDlzyVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page     分页参数
     * @param tDlzyDTO 查询参数
     * @return IPage<TDlzyVO>
     */
    IPage<TDlzyVO> selectList(Page<TDlzyDTO> page, @Param("tDlzyDTO") TDlzyDTO tDlzyDTO);
}
