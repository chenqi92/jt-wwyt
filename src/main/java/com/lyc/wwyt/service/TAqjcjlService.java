package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TAqjcjlEntity;
import com.lyc.wwyt.dto.TAqjcjlDTO;
import com.lyc.wwyt.vo.TAqjcjlVO;

import java.util.List;

/**
 * 安全检查记录表(t_aqjcjl)表服务接口
 *
 * @author chenqi
 * @since 2023-05-16 16:33:47
 */
public interface TAqjcjlService extends IService<TAqjcjlEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TAqjcjlVO>
     */
    List<TAqjcjlVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tAqjcjlDTO 查询参数
     * @return IPage<TAqjcjlVO> tAqjcjlDTO
     */
    IPage<TAqjcjlVO> selectPage(Page<TAqjcjlDTO> page, TAqjcjlDTO tAqjcjlDTO);
}
