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
 * @since 2023-05-12 15:32:04
 */
public interface TCbsglxxService extends IService<TCbsglxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TCbsglxxVO>
     */
    List<TCbsglxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param cbsglxxDTO 查询参数
     * @return IPage<TCbsglxxVO>
     */
    IPage<TCbsglxxVO> selectPage(Page<TCbsglxxDTO> page, TCbsglxxDTO cbsglxxDTO);

}
