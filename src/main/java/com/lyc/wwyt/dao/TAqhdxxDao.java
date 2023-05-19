package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TAqhdxxEntity;
import com.lyc.wwyt.dto.TAqhdxxDTO;
import com.lyc.wwyt.vo.TAqhdxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 安全活动信息表(t_aqhdxx)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-19 14:56:48
 */
@Mapper
public interface TAqhdxxDao extends BaseMapper<TAqhdxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tAqhdxxDTO 查询参数
     * @return IPage<TAqhdxxVO>
     */
    IPage<TAqhdxxVO> queryList(Page<TAqhdxxDTO> page, @Param("tAqhdxxDTO") TAqhdxxDTO tAqhdxxDTO);

    /**
     * 查询所有数据
     *
     * @param tAqhdxxDTO 查询参数
     * @return List<TAqhdxxVO>
     */
    List<TAqhdxxVO> queryList(@Param("tAqhdxxDTO") TAqhdxxDTO tAqhdxxDTO);
}
