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
 * @since 2023-05-16 16:33:52
 */
public interface TYhpcrwxxService extends IService<TYhpcrwxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TYhpcrwxxVO>
     */
    List<TYhpcrwxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tYhpcrwxxDTO 查询参数
     * @return IPage<TYhpcrwxxVO> tYhpcrwxxDTO
     */
    IPage<TYhpcrwxxVO> selectPage(Page<TYhpcrwxxDTO> page, TYhpcrwxxDTO tYhpcrwxxDTO);
}
