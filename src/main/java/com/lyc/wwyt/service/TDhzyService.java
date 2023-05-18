package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TDhzyEntity;
import com.lyc.wwyt.dto.TDhzyDTO;
import com.lyc.wwyt.vo.TDhzyVO;

import java.util.List;

/**
 * 动火作业信息表(t_dhzy)表服务接口
 *
 * @author lhh
 * @since 2023-05-18 15:54:19
 */
public interface TDhzyService extends IService<TDhzyEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TDhzyVO>
     */
    List<TDhzyVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page     分页参数
     * @param tDhzyDTO 查询参数
     * @return IPage<TDhzyVO> tDhzyDTO
     */
    IPage<TDhzyVO> selectPage(Page<TDhzyDTO> page, TDhzyDTO tDhzyDTO);
}
