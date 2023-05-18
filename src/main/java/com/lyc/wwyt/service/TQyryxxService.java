package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TQyryxxEntity;
import com.lyc.wwyt.dto.TQyryxxDTO;
import com.lyc.wwyt.vo.TQyryxxVO;

import java.util.List;

/**
 * 企业人员信息表(t_qyryxx)表服务接口
 *
 * @author lhh
 * @since 2023-05-17 11:20:41
 */
public interface TQyryxxService extends IService<TQyryxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TQyryxxVO>
     */
    List<TQyryxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tQyryxxDTO 查询参数
     * @return IPage<TQyryxxVO> tQyryxxDTO
     */
    IPage<TQyryxxVO> selectPage(Page<TQyryxxDTO> page, TQyryxxDTO tQyryxxDTO);
}
