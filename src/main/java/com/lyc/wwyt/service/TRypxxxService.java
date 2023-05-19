package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TRypxxxEntity;
import com.lyc.wwyt.dto.TRypxxxDTO;
import com.lyc.wwyt.vo.TRypxxxVO;

import java.util.List;

/**
 * 人员培训信息表(t_rypxxx)表服务接口
 *
 * @author chenqi
 * @since 2023-05-19 14:56:42
 */
public interface TRypxxxService extends IService<TRypxxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tRypxxxDTO 查询参数
     * @return IPage<TRypxxxVO> tRypxxxDTO
     */
    IPage<TRypxxxVO> queryPage(Page<TRypxxxDTO> page, TRypxxxDTO tRypxxxDTO);

    /**
     * 查询所有数据
     *
     * @param tRypxxxDTO 查询参数
     * @return List<TRypxxxVO>
     */
    List<TRypxxxVO> queryList(TRypxxxDTO tRypxxxDTO);
}
