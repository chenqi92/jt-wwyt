package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TQzpxdaEntity;
import com.lyc.wwyt.dto.TQzpxdaDTO;
import com.lyc.wwyt.vo.TQzpxdaVO;

import java.util.List;

/**
 * 取证培训档案表(t_qzpxda)表服务接口
 *
 * @author chenqi
 * @since 2023-05-16 16:33:56
 */
public interface TQzpxdaService extends IService<TQzpxdaEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TQzpxdaVO>
     */
    List<TQzpxdaVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tQzpxdaDTO 查询参数
     * @return IPage<TQzpxdaVO> tQzpxdaDTO
     */
    IPage<TQzpxdaVO> selectPage(Page<TQzpxdaDTO> page, TQzpxdaDTO tQzpxdaDTO);
}
