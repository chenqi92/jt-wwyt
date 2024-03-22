package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.dto.TRypxxxDTO;
import com.lyc.wwyt.entity.TRypxxxEntity;
import com.lyc.wwyt.vo.TRypxxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 人员培训信息表(t_rypxxx)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-19 14:56:42
 */
@Mapper
public interface TRypxxxDao extends BaseMapper<TRypxxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tRypxxxDTO 查询参数
     * @return IPage<TRypxxxVO>
     */
    IPage<TRypxxxVO> queryList(Page<TRypxxxDTO> page, @Param("tRypxxxDTO") TRypxxxDTO tRypxxxDTO);

    /**
     * 查询所有数据
     *
     * @param tRypxxxDTO 查询参数
     * @return List<TRypxxxVO>
     */
    List<TRypxxxVO> queryList(@Param("tRypxxxDTO") TRypxxxDTO tRypxxxDTO);
}
