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
 * @since 2023-05-16 16:33:52
 */
@Mapper
public interface TYhpcrwxxDao extends BaseMapper<TYhpcrwxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TYhpcrwxxVO>
     */
    List<TYhpcrwxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tYhpcrwxxDTO 查询参数
     * @return IPage<TYhpcrwxxVO>
     */
    IPage<TYhpcrwxxVO> selectList(Page<TYhpcrwxxDTO> page, @Param("tYhpcrwxxDTO") TYhpcrwxxDTO tYhpcrwxxDTO);
}
