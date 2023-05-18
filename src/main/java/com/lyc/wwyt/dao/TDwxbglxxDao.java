package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TDwxbglxxEntity;
import com.lyc.wwyt.dto.TDwxbglxxDTO;
import com.lyc.wwyt.vo.TDwxbglxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 定位信标管理信息表(t_dwxbglxx)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-18 16:32:18
 */
@Mapper
public interface TDwxbglxxDao extends BaseMapper<TDwxbglxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TDwxbglxxVO>
     */
    List<TDwxbglxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDwxbglxxDTO 查询参数
     * @return IPage<TDwxbglxxVO>
     */
    IPage<TDwxbglxxVO> selectList(Page<TDwxbglxxDTO> page, @Param("tDwxbglxxDTO") TDwxbglxxDTO tDwxbglxxDTO);
}
