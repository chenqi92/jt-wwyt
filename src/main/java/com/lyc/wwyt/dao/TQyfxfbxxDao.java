package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TQyfxfbxxEntity;
import com.lyc.wwyt.dto.TQyfxfbxxDTO;
import com.lyc.wwyt.vo.TQyfxfbxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 企业安全风险分布信息表(t_qyfxfbxx)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-16 16:33:59
 */
@Mapper
public interface TQyfxfbxxDao extends BaseMapper<TQyfxfbxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TQyfxfbxxVO>
     */
    List<TQyfxfbxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tQyfxfbxxDTO 查询参数
     * @return IPage<TQyfxfbxxVO>
     */
    IPage<TQyfxfbxxVO> selectList(Page<TQyfxfbxxDTO> page, @Param("tQyfxfbxxDTO") TQyfxfbxxDTO tQyfxfbxxDTO);
}
