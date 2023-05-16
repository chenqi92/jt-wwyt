package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TPxjgEntity;
import com.lyc.wwyt.dto.TPxjgDTO;
import com.lyc.wwyt.vo.TPxjgVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 培训结果表(t_pxjg)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-16 16:33:46
 */
@Mapper
public interface TPxjgDao extends BaseMapper<TPxjgEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TPxjgVO>
     */
    List<TPxjgVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page     分页参数
     * @param tPxjgDTO 查询参数
     * @return IPage<TPxjgVO>
     */
    IPage<TPxjgVO> selectList(Page<TPxjgDTO> page, @Param("tPxjgDTO") TPxjgDTO tPxjgDTO);
}
