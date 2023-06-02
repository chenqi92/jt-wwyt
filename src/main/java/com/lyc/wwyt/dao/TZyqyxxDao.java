package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.dto.TZyqyxxDTO;
import com.lyc.wwyt.entity.TZyqyxxEntity;
import com.lyc.wwyt.vo.TZyqyxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 作业区域信息表(t_zyqyxx)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-22 14:22:39
 */
@Mapper
public interface TZyqyxxDao extends BaseMapper<TZyqyxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tZyqyxxDTO 查询参数
     * @return IPage<TZyqyxxVO>
     */
    IPage<TZyqyxxVO> queryList(Page<TZyqyxxDTO> page, @Param("tZyqyxxDTO") TZyqyxxDTO tZyqyxxDTO);

    /**
     * 查询所有数据
     *
     * @param tZyqyxxDTO 查询参数
     * @return List<TZyqyxxVO>
     */
    List<TZyqyxxVO> queryList(@Param("tZyqyxxDTO") TZyqyxxDTO tZyqyxxDTO);
}
