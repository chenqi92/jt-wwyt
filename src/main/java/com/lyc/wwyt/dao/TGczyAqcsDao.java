package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TGczyAqcsEntity;
import com.lyc.wwyt.dto.TGczyAqcsDTO;
import com.lyc.wwyt.vo.TGczyAqcsVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 高处作业信息安全措施表(t_gczy_aqcs)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-22 14:16:26
 */
@Mapper
public interface TGczyAqcsDao extends BaseMapper<TGczyAqcsEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tGczyAqcsDTO 查询参数
     * @return IPage<TGczyAqcsVO>
     */
    IPage<TGczyAqcsVO> queryList(Page<TGczyAqcsDTO> page, @Param("tGczyAqcsDTO") TGczyAqcsDTO tGczyAqcsDTO);

    /**
     * 查询所有数据
     *
     * @param tGczyAqcsDTO 查询参数
     * @return List<TGczyAqcsVO>
     */
    List<TGczyAqcsVO> queryList(@Param("tGczyAqcsDTO") TGczyAqcsDTO tGczyAqcsDTO);
}
