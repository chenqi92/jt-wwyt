package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TXmstsxxEntity;
import com.lyc.wwyt.dto.TXmstsxxDTO;
import com.lyc.wwyt.vo.TXmstsxxVO;

import java.util.List;

/**
 * 项目三同时信息表(t_xmstsxx)表服务接口
 *
 * @author lhh
 * @since 2023-05-17 17:19:44
 */
public interface TXmstsxxService extends IService<TXmstsxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TXmstsxxVO>
     */
    List<TXmstsxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page        分页参数
     * @param tXmstsxxDTO 查询参数
     * @return IPage<TXmstsxxVO> tXmstsxxDTO
     */
    IPage<TXmstsxxVO> selectPage(Page<TXmstsxxDTO> page, TXmstsxxDTO tXmstsxxDTO);
}
