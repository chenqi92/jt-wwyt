package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TAqpxjcjlEntity;
import com.lyc.wwyt.dto.TAqpxjcjlDTO;
import com.lyc.wwyt.vo.TAqpxjcjlVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 安全培训奖惩记录表(t_aqpxjcjl)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-16 16:33:54
 */
@Mapper
public interface TAqpxjcjlDao extends BaseMapper<TAqpxjcjlEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TAqpxjcjlVO>
     */
    List<TAqpxjcjlVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tAqpxjcjlDTO 查询参数
     * @return IPage<TAqpxjcjlVO>
     */
    IPage<TAqpxjcjlVO> selectList(Page<TAqpxjcjlDTO> page, @Param("tAqpxjcjlDTO") TAqpxjcjlDTO tAqpxjcjlDTO);
}
