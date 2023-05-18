package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TScsshfxxEntity;
import com.lyc.wwyt.dto.TScsshfxxDTO;
import com.lyc.wwyt.vo.TScsshfxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 生产设备恢复信息(t_scsshfxx)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-17 17:22:10
 */
@Mapper
public interface TScsshfxxDao extends BaseMapper<TScsshfxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TScsshfxxVO>
     */
    List<TScsshfxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tScsshfxxDTO 查询参数
     * @return IPage<TScsshfxxVO>
     */
    IPage<TScsshfxxVO> selectList(Page<TScsshfxxDTO> page, @Param("tScsshfxxDTO") TScsshfxxDTO tScsshfxxDTO);
}
