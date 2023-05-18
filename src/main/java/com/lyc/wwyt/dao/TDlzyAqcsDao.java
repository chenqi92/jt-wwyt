package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TDlzyAqcsEntity;
import com.lyc.wwyt.dto.TDlzyAqcsDTO;
import com.lyc.wwyt.vo.TDlzyAqcsVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 断路作业安全措施表(t_dlzy_aqcs)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-18 15:54:28
 */
@Mapper
public interface TDlzyAqcsDao extends BaseMapper<TDlzyAqcsEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TDlzyAqcsVO>
     */
    List<TDlzyAqcsVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDlzyAqcsDTO 查询参数
     * @return IPage<TDlzyAqcsVO>
     */
    IPage<TDlzyAqcsVO> selectList(Page<TDlzyAqcsDTO> page, @Param("tDlzyAqcsDTO") TDlzyAqcsDTO tDlzyAqcsDTO);
}
