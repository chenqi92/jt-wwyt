package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TCbsxgzsEntity;
import com.lyc.wwyt.dto.TCbsxgzsDTO;
import com.lyc.wwyt.vo.TCbsxgzsVO;

import java.util.List;

/**
 * 承包商相关证书表(t_cbsxgzs)表服务接口
 *
 * @author chenqi
 * @since 2023-05-19 14:56:45
 */
public interface TCbsxgzsService extends IService<TCbsxgzsEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page        分页参数
     * @param tCbsxgzsDTO 查询参数
     * @return IPage<TCbsxgzsVO> tCbsxgzsDTO
     */
    IPage<TCbsxgzsVO> queryPage(Page<TCbsxgzsDTO> page, TCbsxgzsDTO tCbsxgzsDTO);

    /**
     * 查询所有数据
     *
     * @param tCbsxgzsDTO 查询参数
     * @return List<TCbsxgzsVO>
     */
    List<TCbsxgzsVO> queryList(TCbsxgzsDTO tCbsxgzsDTO);
}
