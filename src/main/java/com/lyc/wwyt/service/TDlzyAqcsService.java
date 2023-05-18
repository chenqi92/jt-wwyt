package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TDlzyAqcsEntity;
import com.lyc.wwyt.dto.TDlzyAqcsDTO;
import com.lyc.wwyt.vo.TDlzyAqcsVO;

import java.util.List;

/**
 * 断路作业安全措施表(t_dlzy_aqcs)表服务接口
 *
 * @author lhh
 * @since 2023-05-18 15:54:28
 */
public interface TDlzyAqcsService extends IService<TDlzyAqcsEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TDlzyAqcsVO>
     */
    List<TDlzyAqcsVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDlzyAqcsDTO 查询参数
     * @return IPage<TDlzyAqcsVO> tDlzyAqcsDTO
     */
    IPage<TDlzyAqcsVO> selectPage(Page<TDlzyAqcsDTO> page, TDlzyAqcsDTO tDlzyAqcsDTO);
}
