package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TAqhdjlEntity;
import com.lyc.wwyt.dto.TAqhdjlDTO;
import com.lyc.wwyt.vo.TAqhdjlVO;

import java.util.List;

/**
 * 安全活动记录表(t_aqhdjl)表服务接口
 *
 * @author chenqi
 * @since 2023-05-19 14:56:39
 */
public interface TAqhdjlService extends IService<TAqhdjlEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tAqhdjlDTO 查询参数
     * @return IPage<TAqhdjlVO> tAqhdjlDTO
     */
    IPage<TAqhdjlVO> queryPage(Page<TAqhdjlDTO> page, TAqhdjlDTO tAqhdjlDTO);

    /**
     * 查询所有数据
     *
     * @param tAqhdjlDTO 查询参数
     * @return List<TAqhdjlVO>
     */
    List<TAqhdjlVO> queryList(TAqhdjlDTO tAqhdjlDTO);
}
