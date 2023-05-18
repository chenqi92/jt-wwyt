package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TZdwxyglxxEntity;
import com.lyc.wwyt.dto.TZdwxyglxxDTO;
import com.lyc.wwyt.vo.TZdwxyglxxVO;

import java.util.List;

/**
 * 重大危险源管理信息表(t_zdwxyglxx)表服务接口
 *
 * @author lhh
 * @since 2023-05-17 14:04:25
 */
public interface TZdwxyglxxService extends IService<TZdwxyglxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TZdwxyglxxVO>
     */
    List<TZdwxyglxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page          分页参数
     * @param tZdwxyglxxDTO 查询参数
     * @return IPage<TZdwxyglxxVO> tZdwxyglxxDTO
     */
    IPage<TZdwxyglxxVO> selectPage(Page<TZdwxyglxxDTO> page, TZdwxyglxxDTO tZdwxyglxxDTO);
}
