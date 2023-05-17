package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TGysglxxEntity;
import com.lyc.wwyt.dto.TGysglxxDTO;
import com.lyc.wwyt.vo.TGysglxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 供应商管理信息表(t_gysglxx)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-16 16:33:56
 */
@Mapper
public interface TGysglxxDao extends BaseMapper<TGysglxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TGysglxxVO>
     */
    List<TGysglxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page        分页参数
     * @param tGysglxxDTO 查询参数
     * @return IPage<TGysglxxVO>
     */
    IPage<TGysglxxVO> selectList(Page<TGysglxxDTO> page, @Param("tGysglxxDTO") TGysglxxDTO tGysglxxDTO);
}
