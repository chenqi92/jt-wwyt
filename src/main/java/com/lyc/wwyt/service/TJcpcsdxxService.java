package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TJcpcsdxxEntity;
import com.lyc.wwyt.dto.TJcpcsdxxDTO;
import com.lyc.wwyt.vo.TJcpcsdxxVO;

import java.util.List;

/**
 * 检查频次设定信息表(t_jcpcsdxx)表服务接口
 *
 * @author lhh
 * @since 2023-05-17 17:22:13
 */
public interface TJcpcsdxxService extends IService<TJcpcsdxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TJcpcsdxxVO>
     */
    List<TJcpcsdxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tJcpcsdxxDTO 查询参数
     * @return IPage<TJcpcsdxxVO> tJcpcsdxxDTO
     */
    IPage<TJcpcsdxxVO> selectPage(Page<TJcpcsdxxDTO> page, TJcpcsdxxDTO tJcpcsdxxDTO);
}
