package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TCbswzjlxxEntity;
import com.lyc.wwyt.dto.TCbswzjlxxDTO;
import com.lyc.wwyt.vo.TCbswzjlxxVO;

import java.util.List;

/**
 * 承包商违章记录信息表(t_cbswzjlxx)表服务接口
 *
 * @author chenqi
 * @since 2023-05-16 16:33:43
 */
public interface TCbswzjlxxService extends IService<TCbswzjlxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TCbswzjlxxVO>
     */
    List<TCbswzjlxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page          分页参数
     * @param tCbswzjlxxDTO 查询参数
     * @return IPage<TCbswzjlxxVO> tCbswzjlxxDTO
     */
    IPage<TCbswzjlxxVO> selectPage(Page<TCbswzjlxxDTO> page, TCbswzjlxxDTO tCbswzjlxxDTO);
}
