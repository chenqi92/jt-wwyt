package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.dto.TGczyAqcsDTO;
import com.lyc.wwyt.entity.TGczyAqcsEntity;
import com.lyc.wwyt.vo.TGczyAqcsVO;

import java.util.List;

/**
 * 高处作业信息安全措施表(t_gczy_aqcs)表服务接口
 *
 * @author lhh
 * @since 2023-05-22 14:16:26
 */
public interface TGczyAqcsService extends IService<TGczyAqcsEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tGczyAqcsDTO 查询参数
     * @return IPage<TGczyAqcsVO> tGczyAqcsDTO
     */
    IPage<TGczyAqcsVO> queryPage(Page<TGczyAqcsDTO> page, TGczyAqcsDTO tGczyAqcsDTO);

    /**
     * 查询所有数据
     *
     * @param tGczyAqcsDTO 查询参数
     * @return List<TGczyAqcsVO>
     */
    List<TGczyAqcsVO> queryList(TGczyAqcsDTO tGczyAqcsDTO);
}
