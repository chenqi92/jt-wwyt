package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TMbcdzyAqcsEntity;
import com.lyc.wwyt.dto.TMbcdzyAqcsDTO;
import com.lyc.wwyt.vo.TMbcdzyAqcsVO;

import java.util.List;

/**
 * 盲板抽堵安全措施表(t_mbcdzy_aqcs)表服务接口
 *
 * @author lhh
 * @since 2023-05-18 15:55:06
 */
public interface TMbcdzyAqcsService extends IService<TMbcdzyAqcsEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TMbcdzyAqcsVO>
     */
    List<TMbcdzyAqcsVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tMbcdzyAqcsDTO 查询参数
     * @return IPage<TMbcdzyAqcsVO> tMbcdzyAqcsDTO
     */
    IPage<TMbcdzyAqcsVO> selectPage(Page<TMbcdzyAqcsDTO> page, TMbcdzyAqcsDTO tMbcdzyAqcsDTO);
}
