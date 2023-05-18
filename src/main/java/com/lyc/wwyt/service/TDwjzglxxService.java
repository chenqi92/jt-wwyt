package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TDwjzglxxEntity;
import com.lyc.wwyt.dto.TDwjzglxxDTO;
import com.lyc.wwyt.vo.TDwjzglxxVO;

import java.util.List;

/**
 * 定位基站管理信息表(t_dwjzglxx)表服务接口
 *
 * @author lhh
 * @since 2023-05-18 16:32:17
 */
public interface TDwjzglxxService extends IService<TDwjzglxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TDwjzglxxVO>
     */
    List<TDwjzglxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDwjzglxxDTO 查询参数
     * @return IPage<TDwjzglxxVO> tDwjzglxxDTO
     */
    IPage<TDwjzglxxVO> selectPage(Page<TDwjzglxxDTO> page, TDwjzglxxDTO tDwjzglxxDTO);
}
