package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.dto.TDtzyAqcsDTO;
import com.lyc.wwyt.entity.TDtzyAqcsEntity;
import com.lyc.wwyt.vo.TDtzyAqcsVO;

import java.util.List;

/**
 * 动土作业安全措施表(t_dtzy_aqcs)表服务接口
 *
 * @author lhh
 * @since 2023-05-22 14:13:42
 */
public interface TDtzyAqcsService extends IService<TDtzyAqcsEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDtzyAqcsDTO 查询参数
     * @return IPage<TDtzyAqcsVO> tDtzyAqcsDTO
     */
    IPage<TDtzyAqcsVO> queryPage(Page<TDtzyAqcsDTO> page, TDtzyAqcsDTO tDtzyAqcsDTO);

    /**
     * 查询所有数据
     *
     * @param tDtzyAqcsDTO 查询参数
     * @return List<TDtzyAqcsVO>
     */
    List<TDtzyAqcsVO> queryList(TDtzyAqcsDTO tDtzyAqcsDTO);
}
