package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TQyqyryxxEntity;
import com.lyc.wwyt.dto.TQyqyryxxDTO;
import com.lyc.wwyt.vo.TQyqyryxxVO;

import java.util.List;

/**
 * 人员在岗在位信息表(t_qyqyryxx)表服务接口
 *
 * @author lhh
 * @since 2023-05-18 16:32:14
 */
public interface TQyqyryxxService extends IService<TQyqyryxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TQyqyryxxVO>
     */
    List<TQyqyryxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tQyqyryxxDTO 查询参数
     * @return IPage<TQyqyryxxVO> tQyqyryxxDTO
     */
    IPage<TQyqyryxxVO> selectPage(Page<TQyqyryxxDTO> page, TQyqyryxxDTO tQyqyryxxDTO);
}
