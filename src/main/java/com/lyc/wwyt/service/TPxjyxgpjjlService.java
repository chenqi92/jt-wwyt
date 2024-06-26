package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.dto.TPxjyxgpjjlDTO;
import com.lyc.wwyt.entity.TPxjyxgpjjlEntity;
import com.lyc.wwyt.vo.TPxjyxgpjjlVO;

import java.util.List;

/**
 * 培训教育效果评价记录表(t_pxjyxgpjjl)表服务接口
 *
 * @author chenqi
 * @since 2023-05-19 14:56:49
 */
public interface TPxjyxgpjjlService extends IService<TPxjyxgpjjlEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tPxjyxgpjjlDTO 查询参数
     * @return IPage<TPxjyxgpjjlVO> tPxjyxgpjjlDTO
     */
    IPage<TPxjyxgpjjlVO> queryPage(Page<TPxjyxgpjjlDTO> page, TPxjyxgpjjlDTO tPxjyxgpjjlDTO);

    /**
     * 查询所有数据
     *
     * @param tPxjyxgpjjlDTO 查询参数
     * @return List<TPxjyxgpjjlVO>
     */
    List<TPxjyxgpjjlVO> queryList(TPxjyxgpjjlDTO tPxjyxgpjjlDTO);
}
