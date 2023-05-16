package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TAqhdjlEntity;
import com.lyc.wwyt.dto.TAqhdjlDTO;
import com.lyc.wwyt.vo.TAqhdjlVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 安全活动记录表(t_aqhdjl)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-16 16:33:57
 */
@Mapper
public interface TAqhdjlDao extends BaseMapper<TAqhdjlEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TAqhdjlVO>
     */
    List<TAqhdjlVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tAqhdjlDTO 查询参数
     * @return IPage<TAqhdjlVO>
     */
    IPage<TAqhdjlVO> selectList(Page<TAqhdjlDTO> page, @Param("tAqhdjlDTO") TAqhdjlDTO tAqhdjlDTO);
}
