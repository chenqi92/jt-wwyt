package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TAqpxjcjlEntity;
import com.lyc.wwyt.dto.TAqpxjcjlDTO;
import com.lyc.wwyt.vo.TAqpxjcjlVO;

import java.util.List;

/**
 * 安全培训奖惩记录表(t_aqpxjcjl)表服务接口
 *
 * @author chenqi
 * @since 2023-05-16 16:33:55
 */
public interface TAqpxjcjlService extends IService<TAqpxjcjlEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TAqpxjcjlVO>
     */
    List<TAqpxjcjlVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tAqpxjcjlDTO 查询参数
     * @return IPage<TAqpxjcjlVO> tAqpxjcjlDTO
     */
    IPage<TAqpxjcjlVO> selectPage(Page<TAqpxjcjlDTO> page, TAqpxjcjlDTO tAqpxjcjlDTO);
}
