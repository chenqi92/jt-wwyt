package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TScssjc1xxEntity;
import com.lyc.wwyt.dto.TScssjc1xxDTO;
import com.lyc.wwyt.vo.TScssjc1xxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 生产设施检测信息(t_scssjc1xx)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-17 17:22:10
 */
@Mapper
public interface TScssjc1xxDao extends BaseMapper<TScssjc1xxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TScssjc1xxVO>
     */
    List<TScssjc1xxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page          分页参数
     * @param tScssjc1xxDTO 查询参数
     * @return IPage<TScssjc1xxVO>
     */
    IPage<TScssjc1xxVO> selectList(Page<TScssjc1xxDTO> page, @Param("tScssjc1xxDTO") TScssjc1xxDTO tScssjc1xxDTO);
}
