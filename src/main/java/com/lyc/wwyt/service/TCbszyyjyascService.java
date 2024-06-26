package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.dto.TCbszyyjyascDTO;
import com.lyc.wwyt.entity.TCbszyyjyascEntity;
import com.lyc.wwyt.vo.TCbszyyjyascVO;

import java.util.List;

/**
 * 承包商作业应急预案审查表(t_cbszyyjyasc)表服务接口
 *
 * @author chenqi
 * @since 2023-05-19 14:56:40
 */
public interface TCbszyyjyascService extends IService<TCbszyyjyascEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page            分页参数
     * @param tCbszyyjyascDTO 查询参数
     * @return IPage<TCbszyyjyascVO> tCbszyyjyascDTO
     */
    IPage<TCbszyyjyascVO> queryPage(Page<TCbszyyjyascDTO> page, TCbszyyjyascDTO tCbszyyjyascDTO);

    /**
     * 查询所有数据
     *
     * @param tCbszyyjyascDTO 查询参数
     * @return List<TCbszyyjyascVO>
     */
    List<TCbszyyjyascVO> queryList(TCbszyyjyascDTO tCbszyyjyascDTO);
}
