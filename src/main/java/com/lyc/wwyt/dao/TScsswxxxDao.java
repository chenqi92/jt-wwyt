package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TScsswxxxEntity;
import com.lyc.wwyt.dto.TScsswxxxDTO;
import com.lyc.wwyt.vo.TScsswxxxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 生产设施维修信息(t_scsswxxx)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-17 17:22:11
 */
@Mapper
public interface TScsswxxxDao extends BaseMapper<TScsswxxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TScsswxxxVO>
     */
    List<TScsswxxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tScsswxxxDTO 查询参数
     * @return IPage<TScsswxxxVO>
     */
    IPage<TScsswxxxVO> selectList(Page<TScsswxxxDTO> page, @Param("tScsswxxxDTO") TScsswxxxDTO tScsswxxxDTO);
}
