package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TDlzySplzEntity;
import com.lyc.wwyt.dto.TDlzySplzDTO;
import com.lyc.wwyt.vo.TDlzySplzVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 断路作业审批流转记录表(t_dlzy_splz)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-18 15:54:30
 */
@Mapper
public interface TDlzySplzDao extends BaseMapper<TDlzySplzEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TDlzySplzVO>
     */
    List<TDlzySplzVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDlzySplzDTO 查询参数
     * @return IPage<TDlzySplzVO>
     */
    IPage<TDlzySplzVO> selectList(Page<TDlzySplzDTO> page, @Param("tDlzySplzDTO") TDlzySplzDTO tDlzySplzDTO);
}
