package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TPxjyxgpjjlEntity;
import com.lyc.wwyt.dto.TPxjyxgpjjlDTO;
import com.lyc.wwyt.vo.TPxjyxgpjjlVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 培训教育效果评价记录表(t_pxjyxgpjjl)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-17 16:22:47
 */
@Mapper
public interface TPxjyxgpjjlDao extends BaseMapper<TPxjyxgpjjlEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tPxjyxgpjjlDTO 查询参数
     * @return IPage<TPxjyxgpjjlVO>
     */
    IPage<TPxjyxgpjjlVO> queryList(Page<TPxjyxgpjjlDTO> page, @Param("tPxjyxgpjjlDTO") TPxjyxgpjjlDTO tPxjyxgpjjlDTO);

    /**
     * 查询所有数据
     *
     * @param tPxjyxgpjjlDTO 查询参数
     * @return List<TPxjyxgpjjlVO>
     */
    List<TPxjyxgpjjlVO> queryList(@Param("tPxjyxgpjjlDTO") TPxjyxgpjjlDTO tPxjyxgpjjlDTO);
}
