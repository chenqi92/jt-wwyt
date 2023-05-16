package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TCbszyyjyascEntity;
import com.lyc.wwyt.dto.TCbszyyjyascDTO;
import com.lyc.wwyt.vo.TCbszyyjyascVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 承包商作业应急预案审查表(t_cbszyyjyasc)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-16 16:33:49
 */
@Mapper
public interface TCbszyyjyascDao extends BaseMapper<TCbszyyjyascEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TCbszyyjyascVO>
     */
    List<TCbszyyjyascVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page            分页参数
     * @param tCbszyyjyascDTO 查询参数
     * @return IPage<TCbszyyjyascVO>
     */
    IPage<TCbszyyjyascVO> selectList(Page<TCbszyyjyascDTO> page, @Param("tCbszyyjyascDTO") TCbszyyjyascDTO tCbszyyjyascDTO);
}
