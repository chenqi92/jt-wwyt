package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.dto.TShutdownExamDTO;
import com.lyc.wwyt.entity.TShutdownExamEntity;
import com.lyc.wwyt.vo.TShutdownExamVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 开停车大检修(t_shutdown_exam)表数据库访问层
 *
 * @author chenqi
 * @since 2023-05-23 11:07:25
 */
@Mapper
public interface TShutdownExamDao extends BaseMapper<TShutdownExamEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page             分页参数
     * @param tShutdownExamDTO 查询参数
     * @return IPage<TShutdownExamVO>
     */
    IPage<TShutdownExamVO> queryList(Page<TShutdownExamDTO> page, @Param("tShutdownExamDTO") TShutdownExamDTO tShutdownExamDTO);

    /**
     * 查询所有数据
     *
     * @param tShutdownExamDTO 查询参数
     * @return List<TShutdownExamVO>
     */
    List<TShutdownExamVO> queryList(@Param("tShutdownExamDTO") TShutdownExamDTO tShutdownExamDTO);
}
