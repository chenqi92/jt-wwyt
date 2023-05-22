package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TDlzySplzEntity;
import com.lyc.wwyt.dto.TDlzySplzDTO;
import com.lyc.wwyt.vo.TDlzySplzVO;

import java.util.List;

/**
 * 断路作业审批流转记录表(t_dlzy_splz)表服务接口
 *
 * @author lhh
 * @since 2023-05-22 14:13:41
 */
public interface TDlzySplzService extends IService<TDlzySplzEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDlzySplzDTO 查询参数
     * @return IPage<TDlzySplzVO> tDlzySplzDTO
     */
    IPage<TDlzySplzVO> queryPage(Page<TDlzySplzDTO> page, TDlzySplzDTO tDlzySplzDTO);

    /**
     * 查询所有数据
     *
     * @param tDlzySplzDTO 查询参数
     * @return List<TDlzySplzVO>
     */
    List<TDlzySplzVO> queryList(TDlzySplzDTO tDlzySplzDTO);
}
