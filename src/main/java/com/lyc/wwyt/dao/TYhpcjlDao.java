package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.dto.TYhpcjlDTO;
import com.lyc.wwyt.entity.TYhpcjlEntity;
import com.lyc.wwyt.vo.TYhpcjlVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 隐患排查记录表(t_yhpcjl)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-19 14:56:44
 */
@Mapper
public interface TYhpcjlDao extends BaseMapper<TYhpcjlEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tYhpcjlDTO 查询参数
     * @return IPage<TYhpcjlVO>
     */
    IPage<TYhpcjlVO> queryList(Page<TYhpcjlDTO> page, @Param("tYhpcjlDTO") TYhpcjlDTO tYhpcjlDTO);

    /**
     * 查询所有数据
     *
     * @param tYhpcjlDTO 查询参数
     * @return List<TYhpcjlVO>
     */
    List<TYhpcjlVO> queryList(@Param("tYhpcjlDTO") TYhpcjlDTO tYhpcjlDTO);
}
