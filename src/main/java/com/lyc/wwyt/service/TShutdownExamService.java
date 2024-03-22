package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.dto.TShutdownExamDTO;
import com.lyc.wwyt.entity.TShutdownExamEntity;
import com.lyc.wwyt.vo.TShutdownExamVO;

import java.util.List;

/**
 * 开停车大检修(t_shutdown_exam)表服务接口
 *
 * @author chenqi
 * @since 2023-05-23 11:07:25
 */
public interface TShutdownExamService extends IService<TShutdownExamEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page             分页参数
     * @param tShutdownExamDTO 查询参数
     * @return IPage<TShutdownExamVO> tShutdownExamDTO
     */
    IPage<TShutdownExamVO> queryPage(Page<TShutdownExamDTO> page, TShutdownExamDTO tShutdownExamDTO);

    /**
     * 查询所有数据
     *
     * @param tShutdownExamDTO 查询参数
     * @return List<TShutdownExamVO>
     */
    List<TShutdownExamVO> queryList(TShutdownExamDTO tShutdownExamDTO);
}
