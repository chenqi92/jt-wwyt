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
 * @since 2023-05-22 14:13:41
 */
@Mapper
public interface TDlzyAqcsDao extends BaseMapper<TDlzyAqcsEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDlzyAqcsDTO 查询参数
     * @return IPage<TDlzyAqcsVO>
     */
    IPage<TDlzyAqcsVO> queryList(Page<TDlzyAqcsDTO> page, @Param("tDlzyAqcsDTO") TDlzyAqcsDTO tDlzyAqcsDTO);

    /**
     * 查询所有数据
     *
     * @param tDlzyAqcsDTO 查询参数
     * @return List<TDlzyAqcsVO>
     */
    List<TDlzyAqcsVO> queryList(@Param("tDlzyAqcsDTO") TDlzyAqcsDTO tDlzyAqcsDTO);
}
