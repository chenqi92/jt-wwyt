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
 * @since 2023-05-22 14:16:27
 */
public interface TJcpcsdxxService extends IService<TJcpcsdxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tJcpcsdxxDTO 查询参数
     * @return IPage<TJcpcsdxxVO> tJcpcsdxxDTO
     */
    IPage<TJcpcsdxxVO> queryPage(Page<TJcpcsdxxDTO> page, TJcpcsdxxDTO tJcpcsdxxDTO);

    /**
     * 查询所有数据
     *
     * @param tJcpcsdxxDTO 查询参数
     * @return List<TJcpcsdxxVO>
     */
    List<TJcpcsdxxVO> queryList(TJcpcsdxxDTO tJcpcsdxxDTO);
}
