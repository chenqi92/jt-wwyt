package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TGysglxxEntity;
import com.lyc.wwyt.dto.TGysglxxDTO;
import com.lyc.wwyt.vo.TGysglxxVO;

import java.util.List;

/**
 * 供应商管理信息表(t_gysglxx)表服务接口
 *
 * @author chenqi
 * @since 2023-05-16 16:33:56
 */
public interface TGysglxxService extends IService<TGysglxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TGysglxxVO>
     */
    List<TGysglxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page        分页参数
     * @param tGysglxxDTO 查询参数
     * @return IPage<TGysglxxVO> tGysglxxDTO
     */
    IPage<TGysglxxVO> selectPage(Page<TGysglxxDTO> page, TGysglxxDTO tGysglxxDTO);
}
