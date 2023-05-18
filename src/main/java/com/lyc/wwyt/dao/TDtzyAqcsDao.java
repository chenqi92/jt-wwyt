package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TDtzyAqcsEntity;
import com.lyc.wwyt.dto.TDtzyAqcsDTO;
import com.lyc.wwyt.vo.TDtzyAqcsVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 动土作业安全措施表(t_dtzy_aqcs)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-18 15:54:35
 */
@Mapper
public interface TDtzyAqcsDao extends BaseMapper<TDtzyAqcsEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TDtzyAqcsVO>
     */
    List<TDtzyAqcsVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDtzyAqcsDTO 查询参数
     * @return IPage<TDtzyAqcsVO>
     */
    IPage<TDtzyAqcsVO> selectList(Page<TDtzyAqcsDTO> page, @Param("tDtzyAqcsDTO") TDtzyAqcsDTO tDtzyAqcsDTO);
}
