package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.dto.TCbsglxxDTO;
import com.lyc.wwyt.entity.TCbsglxxEntity;
import com.lyc.wwyt.vo.TCbsglxxVO;

import java.util.List;

/**
 * 承包商管理信息表(t_cbsglxx)表服务接口
 *
 * @author chenqi
 * @since 2023-05-19 14:56:38
 */
public interface TCbsglxxService extends IService<TCbsglxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page        分页参数
     * @param tCbsglxxDTO 查询参数
     * @return IPage<TCbsglxxVO> tCbsglxxDTO
     */
    IPage<TCbsglxxVO> queryPage(Page<TCbsglxxDTO> page, TCbsglxxDTO tCbsglxxDTO);

    /**
     * 查询所有数据
     *
     * @param tCbsglxxDTO 查询参数
     * @return List<TCbsglxxVO>
     */
    List<TCbsglxxVO> queryList(TCbsglxxDTO tCbsglxxDTO);
}
