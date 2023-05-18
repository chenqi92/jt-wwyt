package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TQyqyryxxEntity;
import com.lyc.wwyt.dto.TQyqyryxxDTO;
import com.lyc.wwyt.vo.TQyqyryxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 人员在岗在位信息表(t_qyqyryxx)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-18 16:32:14
 */
@Mapper
public interface TQyqyryxxDao extends BaseMapper<TQyqyryxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TQyqyryxxVO>
     */
    List<TQyqyryxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tQyqyryxxDTO 查询参数
     * @return IPage<TQyqyryxxVO>
     */
    IPage<TQyqyryxxVO> selectList(Page<TQyqyryxxDTO> page, @Param("tQyqyryxxDTO") TQyqyryxxDTO tQyqyryxxDTO);
}
