package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.dto.TQyfxfbxxDTO;
import com.lyc.wwyt.entity.TQyfxfbxxEntity;
import com.lyc.wwyt.vo.TQyfxfbxxVO;

import java.util.List;

/**
 * 企业安全风险分布信息表(t_qyfxfbxx)表服务接口
 *
 * @author chenqi
 * @since 2023-05-19 14:56:38
 */
public interface TQyfxfbxxService extends IService<TQyfxfbxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tQyfxfbxxDTO 查询参数
     * @return IPage<TQyfxfbxxVO> tQyfxfbxxDTO
     */
    IPage<TQyfxfbxxVO> queryPage(Page<TQyfxfbxxDTO> page, TQyfxfbxxDTO tQyfxfbxxDTO);

    /**
     * 查询所有数据
     *
     * @param tQyfxfbxxDTO 查询参数
     * @return List<TQyfxfbxxVO>
     */
    List<TQyfxfbxxVO> queryList(TQyfxfbxxDTO tQyfxfbxxDTO);
}
