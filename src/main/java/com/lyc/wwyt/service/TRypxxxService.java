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
 * @since 2023-05-16 16:33:59
 */
public interface TRypxxxService extends IService<TRypxxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TRypxxxVO>
     */
    List<TRypxxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tRypxxxDTO 查询参数
     * @return IPage<TRypxxxVO> tRypxxxDTO
     */
    IPage<TRypxxxVO> selectPage(Page<TRypxxxDTO> page, TRypxxxDTO tRypxxxDTO);
}
