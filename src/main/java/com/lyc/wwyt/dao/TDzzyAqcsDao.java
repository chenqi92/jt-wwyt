package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.dto.TDzzyAqcsDTO;
import com.lyc.wwyt.entity.TDzzyAqcsEntity;
import com.lyc.wwyt.vo.TDzzyAqcsVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 吊装作业安全措施表(t_dzzy_aqcs)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-22 14:16:24
 */
@Mapper
public interface TDzzyAqcsDao extends BaseMapper<TDzzyAqcsEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDzzyAqcsDTO 查询参数
     * @return IPage<TDzzyAqcsVO>
     */
    IPage<TDzzyAqcsVO> queryList(Page<TDzzyAqcsDTO> page, @Param("tDzzyAqcsDTO") TDzzyAqcsDTO tDzzyAqcsDTO);

    /**
     * 查询所有数据
     *
     * @param tDzzyAqcsDTO 查询参数
     * @return List<TDzzyAqcsVO>
     */
    List<TDzzyAqcsVO> queryList(@Param("tDzzyAqcsDTO") TDzzyAqcsDTO tDzzyAqcsDTO);
}
