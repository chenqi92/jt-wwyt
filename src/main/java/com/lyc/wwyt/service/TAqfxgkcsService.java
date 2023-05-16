package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TAqfxgkcsEntity;
import com.lyc.wwyt.dto.TAqfxgkcsDTO;
import com.lyc.wwyt.vo.TAqfxgkcsVO;

import java.util.List;

/**
 * 安全风险管控措施表结构(t_aqfxgkcs)表服务接口
 *
 * @author chenqi
 * @since 2023-05-16 16:33:51
 */
public interface TAqfxgkcsService extends IService<TAqfxgkcsEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TAqfxgkcsVO>
     */
    List<TAqfxgkcsVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tAqfxgkcsDTO 查询参数
     * @return IPage<TAqfxgkcsVO> tAqfxgkcsDTO
     */
    IPage<TAqfxgkcsVO> selectPage(Page<TAqfxgkcsDTO> page, TAqfxgkcsDTO tAqfxgkcsDTO);
}
