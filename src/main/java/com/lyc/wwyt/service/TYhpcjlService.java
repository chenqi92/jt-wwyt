package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TYhpcjlEntity;
import com.lyc.wwyt.dto.TYhpcjlDTO;
import com.lyc.wwyt.vo.TYhpcjlVO;

import java.util.List;

/**
 * 隐患排查记录表(t_yhpcjl)表服务接口
 *
 * @author chenqi
 * @since 2023-05-19 14:56:44
 */
public interface TYhpcjlService extends IService<TYhpcjlEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tYhpcjlDTO 查询参数
     * @return IPage<TYhpcjlVO> tYhpcjlDTO
     */
    IPage<TYhpcjlVO> queryPage(Page<TYhpcjlDTO> page, TYhpcjlDTO tYhpcjlDTO);

    /**
     * 查询所有数据
     *
     * @param tYhpcjlDTO 查询参数
     * @return List<TYhpcjlVO>
     */
    List<TYhpcjlVO> queryList(TYhpcjlDTO tYhpcjlDTO);
}
