package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.dto.TJcpcsdxxDTO;
import com.lyc.wwyt.entity.TJcpcsdxxEntity;
import com.lyc.wwyt.vo.TJcpcsdxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 检查频次设定信息表(t_jcpcsdxx)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-22 14:16:27
 */
@Mapper
public interface TJcpcsdxxDao extends BaseMapper<TJcpcsdxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tJcpcsdxxDTO 查询参数
     * @return IPage<TJcpcsdxxVO>
     */
    IPage<TJcpcsdxxVO> queryList(Page<TJcpcsdxxDTO> page, @Param("tJcpcsdxxDTO") TJcpcsdxxDTO tJcpcsdxxDTO);

    /**
     * 查询所有数据
     *
     * @param tJcpcsdxxDTO 查询参数
     * @return List<TJcpcsdxxVO>
     */
    List<TJcpcsdxxVO> queryList(@Param("tJcpcsdxxDTO") TJcpcsdxxDTO tJcpcsdxxDTO);
}
