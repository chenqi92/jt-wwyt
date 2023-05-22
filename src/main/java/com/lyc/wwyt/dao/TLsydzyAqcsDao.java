package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TLsydzyAqcsEntity;
import com.lyc.wwyt.dto.TLsydzyAqcsDTO;
import com.lyc.wwyt.vo.TLsydzyAqcsVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 临时用电安全措施表(t_lsydzy_aqcs)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-22 14:22:29
 */
@Mapper
public interface TLsydzyAqcsDao extends BaseMapper<TLsydzyAqcsEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tLsydzyAqcsDTO 查询参数
     * @return IPage<TLsydzyAqcsVO>
     */
    IPage<TLsydzyAqcsVO> queryList(Page<TLsydzyAqcsDTO> page, @Param("tLsydzyAqcsDTO") TLsydzyAqcsDTO tLsydzyAqcsDTO);

    /**
     * 查询所有数据
     *
     * @param tLsydzyAqcsDTO 查询参数
     * @return List<TLsydzyAqcsVO>
     */
    List<TLsydzyAqcsVO> queryList(@Param("tLsydzyAqcsDTO") TLsydzyAqcsDTO tLsydzyAqcsDTO);
}
