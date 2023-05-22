package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TMbcdzyEntity;
import com.lyc.wwyt.dto.TMbcdzyDTO;
import com.lyc.wwyt.vo.TMbcdzyVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 盲板抽堵信息表(t_mbcdzy)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-22 14:22:30
 */
@Mapper
public interface TMbcdzyDao extends BaseMapper<TMbcdzyEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tMbcdzyDTO 查询参数
     * @return IPage<TMbcdzyVO>
     */
    IPage<TMbcdzyVO> queryList(Page<TMbcdzyDTO> page, @Param("tMbcdzyDTO") TMbcdzyDTO tMbcdzyDTO);

    /**
     * 查询所有数据
     *
     * @param tMbcdzyDTO 查询参数
     * @return List<TMbcdzyVO>
     */
    List<TMbcdzyVO> queryList(@Param("tMbcdzyDTO") TMbcdzyDTO tMbcdzyDTO);
}
