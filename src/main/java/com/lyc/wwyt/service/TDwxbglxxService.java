package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.dto.TDwxbglxxDTO;
import com.lyc.wwyt.entity.TDwxbglxxEntity;
import com.lyc.wwyt.vo.TDwxbglxxVO;

import java.util.List;

/**
 * 定位信标管理信息表(t_dwxbglxx)表服务接口
 *
 * @author lhh
 * @since 2023-05-22 14:16:24
 */
public interface TDwxbglxxService extends IService<TDwxbglxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDwxbglxxDTO 查询参数
     * @return IPage<TDwxbglxxVO> tDwxbglxxDTO
     */
    IPage<TDwxbglxxVO> queryPage(Page<TDwxbglxxDTO> page, TDwxbglxxDTO tDwxbglxxDTO);

    /**
     * 查询所有数据
     *
     * @param tDwxbglxxDTO 查询参数
     * @return List<TDwxbglxxVO>
     */
    List<TDwxbglxxVO> queryList(TDwxbglxxDTO tDwxbglxxDTO);
}
