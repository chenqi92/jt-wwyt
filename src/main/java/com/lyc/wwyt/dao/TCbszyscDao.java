package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TCbszyscEntity;
import com.lyc.wwyt.dto.TCbszyscDTO;
import com.lyc.wwyt.vo.TCbszyscVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 承包商安全作业规程审查表(t_cbszysc)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-17 16:22:45
 */
@Mapper
public interface TCbszyscDao extends BaseMapper<TCbszyscEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page        分页参数
     * @param tCbszyscDTO 查询参数
     * @return IPage<TCbszyscVO>
     */
    IPage<TCbszyscVO> queryList(Page<TCbszyscDTO> page, @Param("tCbszyscDTO") TCbszyscDTO tCbszyscDTO);

    /**
     * 查询所有数据
     *
     * @param tCbszyscDTO 查询参数
     * @return List<TCbszyscVO>
     */
    List<TCbszyscVO> queryList(@Param("tCbszyscDTO") TCbszyscDTO tCbszyscDTO);
}
