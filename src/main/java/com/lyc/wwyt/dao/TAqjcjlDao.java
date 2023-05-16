package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TAqjcjlEntity;
import com.lyc.wwyt.dto.TAqjcjlDTO;
import com.lyc.wwyt.vo.TAqjcjlVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 安全检查记录表(t_aqjcjl)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-16 16:33:47
 */
@Mapper
public interface TAqjcjlDao extends BaseMapper<TAqjcjlEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TAqjcjlVO>
     */
    List<TAqjcjlVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tAqjcjlDTO 查询参数
     * @return IPage<TAqjcjlVO>
     */
    IPage<TAqjcjlVO> selectList(Page<TAqjcjlDTO> page, @Param("tAqjcjlDTO") TAqjcjlDTO tAqjcjlDTO);
}
