package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TDwjcxxEntity;
import com.lyc.wwyt.dto.TDwjcxxDTO;
import com.lyc.wwyt.vo.TDwjcxxVO;

import java.util.List;

/**
 * 点位检查信息表(t_dwjcxx)表服务接口
 *
 * @author lhh
 * @since 2023-05-17 17:22:13
 */
public interface TDwjcxxService extends IService<TDwjcxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TDwjcxxVO>
     */
    List<TDwjcxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tDwjcxxDTO 查询参数
     * @return IPage<TDwjcxxVO> tDwjcxxDTO
     */
    IPage<TDwjcxxVO> selectPage(Page<TDwjcxxDTO> page, TDwjcxxDTO tDwjcxxDTO);
}
