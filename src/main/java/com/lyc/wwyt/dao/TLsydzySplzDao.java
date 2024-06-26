package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.dto.TLsydzySplzDTO;
import com.lyc.wwyt.entity.TLsydzySplzEntity;
import com.lyc.wwyt.vo.TLsydzySplzVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 临时用电作业审批流转记录表(t_lsydzy_splz)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-22 14:22:30
 */
@Mapper
public interface TLsydzySplzDao extends BaseMapper<TLsydzySplzEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tLsydzySplzDTO 查询参数
     * @return IPage<TLsydzySplzVO>
     */
    IPage<TLsydzySplzVO> queryList(Page<TLsydzySplzDTO> page, @Param("tLsydzySplzDTO") TLsydzySplzDTO tLsydzySplzDTO);

    /**
     * 查询所有数据
     *
     * @param tLsydzySplzDTO 查询参数
     * @return List<TLsydzySplzVO>
     */
    List<TLsydzySplzVO> queryList(@Param("tLsydzySplzDTO") TLsydzySplzDTO tLsydzySplzDTO);
}
