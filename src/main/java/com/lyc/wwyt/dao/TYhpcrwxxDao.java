package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TYhpcrwxxEntity;
import com.lyc.wwyt.dto.TYhpcrwxxDTO;
import com.lyc.wwyt.vo.TYhpcrwxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 隐患排查任务信息表(t_yhpcrwxx)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-17 16:22:39
 */
@Mapper
public interface TYhpcrwxxDao extends BaseMapper<TYhpcrwxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tYhpcrwxxDTO 查询参数
     * @return IPage<TYhpcrwxxVO>
     */
    IPage<TYhpcrwxxVO> queryList(Page<TYhpcrwxxDTO> page, @Param("tYhpcrwxxDTO") TYhpcrwxxDTO tYhpcrwxxDTO);

    /**
     * 查询所有数据
     *
     * @param tYhpcrwxxDTO 查询参数
     * @return List<TYhpcrwxxVO>
     */
    List<TYhpcrwxxVO> queryList(@Param("tYhpcrwxxDTO") TYhpcrwxxDTO tYhpcrwxxDTO);
}
