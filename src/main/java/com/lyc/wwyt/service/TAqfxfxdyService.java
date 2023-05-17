package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TAqfxfxdyEntity;
import com.lyc.wwyt.dto.TAqfxfxdyDTO;
import com.lyc.wwyt.vo.TAqfxfxdyVO;

import java.util.List;

/**
 * 安全风险分析单元表(t_aqfxfxdy)表服务接口
 *
 * @author chenqi
 * @since 2023-05-16 16:33:51
 */
public interface TAqfxfxdyService extends IService<TAqfxfxdyEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TAqfxfxdyVO>
     */
    List<TAqfxfxdyVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tAqfxfxdyDTO 查询参数
     * @return IPage<TAqfxfxdyVO> tAqfxfxdyDTO
     */
    IPage<TAqfxfxdyVO> selectPage(Page<TAqfxfxdyDTO> page, TAqfxfxdyDTO tAqfxfxdyDTO);
}
