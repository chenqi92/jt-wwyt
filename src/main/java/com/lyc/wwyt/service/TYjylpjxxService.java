package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TYjylpjxxEntity;
import com.lyc.wwyt.dto.TYjylpjxxDTO;
import com.lyc.wwyt.vo.TYjylpjxxVO;

import java.util.List;

/**
 * 应急演练评价表（t_yjylpjxx）(t_yjylpjxx)表服务接口
 *
 * @author chenqi
 * @since 2023-05-16 16:33:53
 */
public interface TYjylpjxxService extends IService<TYjylpjxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TYjylpjxxVO>
     */
    List<TYjylpjxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tYjylpjxxDTO 查询参数
     * @return IPage<TYjylpjxxVO> tYjylpjxxDTO
     */
    IPage<TYjylpjxxVO> selectPage(Page<TYjylpjxxDTO> page, TYjylpjxxDTO tYjylpjxxDTO);
}
