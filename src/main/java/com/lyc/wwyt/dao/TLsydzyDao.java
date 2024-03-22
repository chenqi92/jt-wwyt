package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.dto.TLsydzyDTO;
import com.lyc.wwyt.entity.TLsydzyEntity;
import com.lyc.wwyt.vo.TLsydzyVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 临时用电信息表(t_lsydzy)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-22 14:22:29
 */
@Mapper
public interface TLsydzyDao extends BaseMapper<TLsydzyEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tLsydzyDTO 查询参数
     * @return IPage<TLsydzyVO>
     */
    IPage<TLsydzyVO> queryList(Page<TLsydzyDTO> page, @Param("tLsydzyDTO") TLsydzyDTO tLsydzyDTO);

    /**
     * 查询所有数据
     *
     * @param tLsydzyDTO 查询参数
     * @return List<TLsydzyVO>
     */
    List<TLsydzyVO> queryList(@Param("tLsydzyDTO") TLsydzyDTO tLsydzyDTO);
}
