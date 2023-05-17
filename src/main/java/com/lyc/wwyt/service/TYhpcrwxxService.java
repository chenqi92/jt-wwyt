package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TYhpcrwxxEntity;
import com.lyc.wwyt.dto.TYhpcrwxxDTO;
import com.lyc.wwyt.vo.TYhpcrwxxVO;

import java.util.List;

/**
 * 隐患排查任务信息表(t_yhpcrwxx)表服务接口
 *
 * @author chenqi
 * @since 2023-05-17 16:22:39
 */
public interface TYhpcrwxxService extends IService<TYhpcrwxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tYhpcrwxxDTO 查询参数
     * @return IPage<TYhpcrwxxVO> tYhpcrwxxDTO
     */
    IPage<TYhpcrwxxVO> queryPage(Page<TYhpcrwxxDTO> page, TYhpcrwxxDTO tYhpcrwxxDTO);

    /**
     * 查询所有数据
     *
     * @param tYhpcrwxxDTO 查询参数
     * @return List<TYhpcrwxxVO>
     */
    List<TYhpcrwxxVO> queryList(TYhpcrwxxDTO tYhpcrwxxDTO);
}
