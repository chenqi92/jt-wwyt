package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TDzzySplzEntity;
import com.lyc.wwyt.dto.TDzzySplzDTO;
import com.lyc.wwyt.vo.TDzzySplzVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 吊装作业审批流转记录表(t_dzzy_splz)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-22 14:16:25
 */
@Mapper
public interface TDzzySplzDao extends BaseMapper<TDzzySplzEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDzzySplzDTO 查询参数
     * @return IPage<TDzzySplzVO>
     */
    IPage<TDzzySplzVO> queryList(Page<TDzzySplzDTO> page, @Param("tDzzySplzDTO") TDzzySplzDTO tDzzySplzDTO);

    /**
     * 查询所有数据
     *
     * @param tDzzySplzDTO 查询参数
     * @return List<TDzzySplzVO>
     */
    List<TDzzySplzVO> queryList(@Param("tDzzySplzDTO") TDzzySplzDTO tDzzySplzDTO);
}
