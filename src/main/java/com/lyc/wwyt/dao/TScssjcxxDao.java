package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TScssjcxxEntity;
import com.lyc.wwyt.dto.TScssjcxxDTO;
import com.lyc.wwyt.vo.TScssjcxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 生产设施检查信息(t_scssjcxx)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-17 17:22:11
 */
@Mapper
public interface TScssjcxxDao extends BaseMapper<TScssjcxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TScssjcxxVO>
     */
    List<TScssjcxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tScssjcxxDTO 查询参数
     * @return IPage<TScssjcxxVO>
     */
    IPage<TScssjcxxVO> selectList(Page<TScssjcxxDTO> page, @Param("tScssjcxxDTO") TScssjcxxDTO tScssjcxxDTO);
}
