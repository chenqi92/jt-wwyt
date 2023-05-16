package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TPxjgEntity;
import com.lyc.wwyt.dto.TPxjgDTO;
import com.lyc.wwyt.vo.TPxjgVO;

import java.util.List;

/**
 * 培训结果表(t_pxjg)表服务接口
 *
 * @author chenqi
 * @since 2023-05-16 16:33:46
 */
public interface TPxjgService extends IService<TPxjgEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TPxjgVO>
     */
    List<TPxjgVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page     分页参数
     * @param tPxjgDTO 查询参数
     * @return IPage<TPxjgVO> tPxjgDTO
     */
    IPage<TPxjgVO> selectPage(Page<TPxjgDTO> page, TPxjgDTO tPxjgDTO);
}
