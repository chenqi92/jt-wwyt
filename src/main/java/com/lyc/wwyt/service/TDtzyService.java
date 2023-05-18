package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TDtzyEntity;
import com.lyc.wwyt.dto.TDtzyDTO;
import com.lyc.wwyt.vo.TDtzyVO;

import java.util.List;

/**
 * 动土作业信息表(t_dtzy)表服务接口
 *
 * @author lhh
 * @since 2023-05-18 15:54:33
 */
public interface TDtzyService extends IService<TDtzyEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TDtzyVO>
     */
    List<TDtzyVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page     分页参数
     * @param tDtzyDTO 查询参数
     * @return IPage<TDtzyVO> tDtzyDTO
     */
    IPage<TDtzyVO> selectPage(Page<TDtzyDTO> page, TDtzyDTO tDtzyDTO);
}
