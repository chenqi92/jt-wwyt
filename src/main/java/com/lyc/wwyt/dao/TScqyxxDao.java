package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TScqyxxEntity;
import com.lyc.wwyt.dto.TScqyxxDTO;
import com.lyc.wwyt.vo.TScqyxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 生产区域信息表(t_scqyxx)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-17 17:22:12
 */
@Mapper
public interface TScqyxxDao extends BaseMapper<TScqyxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TScqyxxVO>
     */
    List<TScqyxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tScqyxxDTO 查询参数
     * @return IPage<TScqyxxVO>
     */
    IPage<TScqyxxVO> selectList(Page<TScqyxxDTO> page, @Param("tScqyxxDTO") TScqyxxDTO tScqyxxDTO);
}
