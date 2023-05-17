package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TCbsxgzsEntity;
import com.lyc.wwyt.dto.TCbsxgzsDTO;
import com.lyc.wwyt.vo.TCbsxgzsVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 承包商相关证书表(t_cbsxgzs)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-17 16:22:40
 */
@Mapper
public interface TCbsxgzsDao extends BaseMapper<TCbsxgzsEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page        分页参数
     * @param tCbsxgzsDTO 查询参数
     * @return IPage<TCbsxgzsVO>
     */
    IPage<TCbsxgzsVO> queryList(Page<TCbsxgzsDTO> page, @Param("tCbsxgzsDTO") TCbsxgzsDTO tCbsxgzsDTO);

    /**
     * 查询所有数据
     *
     * @param tCbsxgzsDTO 查询参数
     * @return List<TCbsxgzsVO>
     */
    List<TCbsxgzsVO> queryList(@Param("tCbsxgzsDTO") TCbsxgzsDTO tCbsxgzsDTO);
}
