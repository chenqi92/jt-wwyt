package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TAqsczrclkxxEntity;
import com.lyc.wwyt.dto.TAqsczrclkxxDTO;
import com.lyc.wwyt.vo.TAqsczrclkxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 安全生产责任承诺卡信息表(t_aqsczrclkxx)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-16 16:33:49
 */
@Mapper
public interface TAqsczrclkxxDao extends BaseMapper<TAqsczrclkxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TAqsczrclkxxVO>
     */
    List<TAqsczrclkxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page            分页参数
     * @param tAqsczrclkxxDTO 查询参数
     * @return IPage<TAqsczrclkxxVO>
     */
    IPage<TAqsczrclkxxVO> selectList(Page<TAqsczrclkxxDTO> page, @Param("tAqsczrclkxxDTO") TAqsczrclkxxDTO tAqsczrclkxxDTO);
}
