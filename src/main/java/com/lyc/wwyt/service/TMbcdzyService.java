package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TMbcdzyEntity;
import com.lyc.wwyt.dto.TMbcdzyDTO;
import com.lyc.wwyt.vo.TMbcdzyVO;

import java.util.List;

/**
 * 盲板抽堵信息表(t_mbcdzy)表服务接口
 *
 * @author lhh
 * @since 2023-05-18 15:55:04
 */
public interface TMbcdzyService extends IService<TMbcdzyEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TMbcdzyVO>
     */
    List<TMbcdzyVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tMbcdzyDTO 查询参数
     * @return IPage<TMbcdzyVO> tMbcdzyDTO
     */
    IPage<TMbcdzyVO> selectPage(Page<TMbcdzyDTO> page, TMbcdzyDTO tMbcdzyDTO);
}
