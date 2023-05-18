package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TDzzyEntity;
import com.lyc.wwyt.dto.TDzzyDTO;
import com.lyc.wwyt.vo.TDzzyVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 吊装作业信息表(t_dzzy)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-18 15:54:39
 */
@Mapper
public interface TDzzyDao extends BaseMapper<TDzzyEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TDzzyVO>
     */
    List<TDzzyVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page     分页参数
     * @param tDzzyDTO 查询参数
     * @return IPage<TDzzyVO>
     */
    IPage<TDzzyVO> selectList(Page<TDzzyDTO> page, @Param("tDzzyDTO") TDzzyDTO tDzzyDTO);
}
