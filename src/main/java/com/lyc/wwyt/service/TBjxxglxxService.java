package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TBjxxglxxEntity;
import com.lyc.wwyt.dto.TBjxxglxxDTO;
import com.lyc.wwyt.vo.TBjxxglxxVO;

import java.util.List;

/**
 * 报警信息管理信息表(t_bjxxglxx)表服务接口
 *
 * @author lhh
 * @since 2023-05-18 16:32:23
 */
public interface TBjxxglxxService extends IService<TBjxxglxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TBjxxglxxVO>
     */
    List<TBjxxglxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tBjxxglxxDTO 查询参数
     * @return IPage<TBjxxglxxVO> tBjxxglxxDTO
     */
    IPage<TBjxxglxxVO> selectPage(Page<TBjxxglxxDTO> page, TBjxxglxxDTO tBjxxglxxDTO);
}
