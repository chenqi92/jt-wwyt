package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TDhzyAqcsEntity;
import com.lyc.wwyt.dto.TDhzyAqcsDTO;
import com.lyc.wwyt.vo.TDhzyAqcsVO;

import java.util.List;

/**
 * 动火作业安全措施表(t_dhzy_aqcs)表服务接口
 *
 * @author lhh
 * @since 2023-05-18 15:54:21
 */
public interface TDhzyAqcsService extends IService<TDhzyAqcsEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TDhzyAqcsVO>
     */
    List<TDhzyAqcsVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDhzyAqcsDTO 查询参数
     * @return IPage<TDhzyAqcsVO> tDhzyAqcsDTO
     */
    IPage<TDhzyAqcsVO> selectPage(Page<TDhzyAqcsDTO> page, TDhzyAqcsDTO tDhzyAqcsDTO);
}
