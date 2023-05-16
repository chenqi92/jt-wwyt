package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TPxhdxxEntity;
import com.lyc.wwyt.dto.TPxhdxxDTO;
import com.lyc.wwyt.vo.TPxhdxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 培训活动信息表(t_pxhdxx)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-16 16:33:50
 */
@Mapper
public interface TPxhdxxDao extends BaseMapper<TPxhdxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TPxhdxxVO>
     */
    List<TPxhdxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tPxhdxxDTO 查询参数
     * @return IPage<TPxhdxxVO>
     */
    IPage<TPxhdxxVO> selectList(Page<TPxhdxxDTO> page, @Param("tPxhdxxDTO") TPxhdxxDTO tPxhdxxDTO);
}
