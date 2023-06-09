package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.dto.TMbcdzyDTO;
import com.lyc.wwyt.entity.TMbcdzyEntity;
import com.lyc.wwyt.vo.TMbcdzyVO;

import java.util.List;

/**
 * 盲板抽堵信息表(t_mbcdzy)表服务接口
 *
 * @author lhh
 * @since 2023-05-22 14:22:30
 */
public interface TMbcdzyService extends IService<TMbcdzyEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tMbcdzyDTO 查询参数
     * @return IPage<TMbcdzyVO> tMbcdzyDTO
     */
    IPage<TMbcdzyVO> queryPage(Page<TMbcdzyDTO> page, TMbcdzyDTO tMbcdzyDTO);

    /**
     * 查询所有数据
     *
     * @param tMbcdzyDTO 查询参数
     * @return List<TMbcdzyVO>
     */
    List<TMbcdzyVO> queryList(TMbcdzyDTO tMbcdzyDTO);
}
