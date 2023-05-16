package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TYjdwglxxEntity;
import com.lyc.wwyt.dto.TYjdwglxxDTO;
import com.lyc.wwyt.vo.TYjdwglxxVO;

import java.util.List;

/**
 * 应急队伍管理信息表(t_yjdwglxx)表服务接口
 *
 * @author chenqi
 * @since 2023-05-16 16:33:40
 */
public interface TYjdwglxxService extends IService<TYjdwglxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TYjdwglxxVO>
     */
    List<TYjdwglxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tYjdwglxxDTO 查询参数
     * @return IPage<TYjdwglxxVO> tYjdwglxxDTO
     */
    IPage<TYjdwglxxVO> selectPage(Page<TYjdwglxxDTO> page, TYjdwglxxDTO tYjdwglxxDTO);
}
