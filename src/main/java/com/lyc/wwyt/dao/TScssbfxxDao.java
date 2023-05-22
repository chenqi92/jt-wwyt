package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TScssbfxxEntity;
import com.lyc.wwyt.dto.TScssbfxxDTO;
import com.lyc.wwyt.vo.TScssbfxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 生产设备报废信息(t_scssbfxx)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-22 14:22:33
 */
@Mapper
public interface TScssbfxxDao extends BaseMapper<TScssbfxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tScssbfxxDTO 查询参数
     * @return IPage<TScssbfxxVO>
     */
    IPage<TScssbfxxVO> queryList(Page<TScssbfxxDTO> page, @Param("tScssbfxxDTO") TScssbfxxDTO tScssbfxxDTO);

    /**
     * 查询所有数据
     *
     * @param tScssbfxxDTO 查询参数
     * @return List<TScssbfxxVO>
     */
    List<TScssbfxxVO> queryList(@Param("tScssbfxxDTO") TScssbfxxDTO tScssbfxxDTO);
}
