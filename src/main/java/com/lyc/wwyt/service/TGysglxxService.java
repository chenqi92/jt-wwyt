package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.dto.TGysglxxDTO;
import com.lyc.wwyt.entity.TGysglxxEntity;
import com.lyc.wwyt.vo.TGysglxxVO;

import java.util.List;

/**
 * 供应商管理信息表(t_gysglxx)表服务接口
 *
 * @author chenqi
 * @since 2023-05-19 14:56:39
 */
public interface TGysglxxService extends IService<TGysglxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page        分页参数
     * @param tGysglxxDTO 查询参数
     * @return IPage<TGysglxxVO> tGysglxxDTO
     */
    IPage<TGysglxxVO> queryPage(Page<TGysglxxDTO> page, TGysglxxDTO tGysglxxDTO);

    /**
     * 查询所有数据
     *
     * @param tGysglxxDTO 查询参数
     * @return List<TGysglxxVO>
     */
    List<TGysglxxVO> queryList(TGysglxxDTO tGysglxxDTO);
}
