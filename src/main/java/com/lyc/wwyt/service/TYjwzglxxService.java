package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TYjwzglxxEntity;
import com.lyc.wwyt.dto.TYjwzglxxDTO;
import com.lyc.wwyt.vo.TYjwzglxxVO;

import java.util.List;

/**
 * 应急物资管理信息表(t_yjwzglxx)表服务接口
 *
 * @author chenqi
 * @since 2023-05-17 16:22:41
 */
public interface TYjwzglxxService extends IService<TYjwzglxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tYjwzglxxDTO 查询参数
     * @return IPage<TYjwzglxxVO> tYjwzglxxDTO
     */
    IPage<TYjwzglxxVO> queryPage(Page<TYjwzglxxDTO> page, TYjwzglxxDTO tYjwzglxxDTO);

    /**
     * 查询所有数据
     *
     * @param tYjwzglxxDTO 查询参数
     * @return List<TYjwzglxxVO>
     */
    List<TYjwzglxxVO> queryList(TYjwzglxxDTO tYjwzglxxDTO);
}
