package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.dto.TQyjcxxDTO;
import com.lyc.wwyt.entity.TQyjcxxEntity;
import com.lyc.wwyt.vo.TQyjcxxVO;

import java.util.List;

/**
 * 企业基础信息表(t_qyjcxx)表服务接口
 *
 * @author lhh
 * @since 2023-05-22 14:22:31
 */
public interface TQyjcxxService extends IService<TQyjcxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tQyjcxxDTO 查询参数
     * @return IPage<TQyjcxxVO> tQyjcxxDTO
     */
    IPage<TQyjcxxVO> queryPage(Page<TQyjcxxDTO> page, TQyjcxxDTO tQyjcxxDTO);

    /**
     * 查询所有数据
     *
     * @param tQyjcxxDTO 查询参数
     * @return List<TQyjcxxVO>
     */
    List<TQyjcxxVO> queryList(TQyjcxxDTO tQyjcxxDTO);
}
