package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.dto.ScCheckDTO;
import com.lyc.wwyt.entity.ScCheckEntity;
import com.lyc.wwyt.vo.ScCheckVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 安全_安全风险、隐患管理(sc_check)表数据库访问层
 *
 * @author chenqi
 * @since 2023-06-01 17:50:57
 */
@Mapper
public interface ScCheckDao extends BaseMapper<ScCheckEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param scCheckDTO 查询参数
     * @return IPage<ScCheckVO>
     */
    IPage<ScCheckVO> queryList(Page<ScCheckDTO> page, @Param("scCheckDTO") ScCheckDTO scCheckDTO);

    /**
     * 查询所有数据
     *
     * @param scCheckDTO 查询参数
     * @return List<ScCheckVO>
     */
    List<ScCheckVO> queryList(@Param("scCheckDTO") ScCheckDTO scCheckDTO);

    boolean saveOrUpdateCheck(@Param("list") List<ScCheckEntity> list);
}
