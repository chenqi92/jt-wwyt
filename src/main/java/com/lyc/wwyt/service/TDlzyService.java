package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.dto.TDlzyDTO;
import com.lyc.wwyt.entity.TDlzyEntity;
import com.lyc.wwyt.vo.TDlzyVO;

import java.util.List;

/**
 * 断路作业信息表(t_dlzy)表服务接口
 *
 * @author lhh
 * @since 2023-05-22 14:13:40
 */
public interface TDlzyService extends IService<TDlzyEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page     分页参数
     * @param tDlzyDTO 查询参数
     * @return IPage<TDlzyVO> tDlzyDTO
     */
    IPage<TDlzyVO> queryPage(Page<TDlzyDTO> page, TDlzyDTO tDlzyDTO);

    /**
     * 查询所有数据
     *
     * @param tDlzyDTO 查询参数
     * @return List<TDlzyVO>
     */
    List<TDlzyVO> queryList(TDlzyDTO tDlzyDTO);
}
