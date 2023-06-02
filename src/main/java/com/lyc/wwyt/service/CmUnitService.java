package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.dto.CmUnitDTO;
import com.lyc.wwyt.entity.CmUnitEntity;
import com.lyc.wwyt.vo.CmUnitVO;

import java.util.List;

/**
 * (cm_unit)表服务接口
 *
 * @author chenqi
 * @since 2023-06-02 14:06:06
 */
public interface CmUnitService extends IService<CmUnitEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page      分页参数
     * @param cmUnitDTO 查询参数
     * @return IPage<CmUnitVO> cmUnitDTO
     */
    IPage<CmUnitVO> queryPage(Page<CmUnitDTO> page, CmUnitDTO cmUnitDTO);

    /**
     * 查询所有数据
     *
     * @param cmUnitDTO 查询参数
     * @return List<CmUnitVO>
     */
    List<CmUnitVO> queryList(CmUnitDTO cmUnitDTO);
}
