package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.dto.TDzzyDTO;
import com.lyc.wwyt.entity.TDzzyEntity;
import com.lyc.wwyt.vo.TDzzyVO;

import java.util.List;

/**
 * 吊装作业信息表(t_dzzy)表服务接口
 *
 * @author lhh
 * @since 2023-05-22 14:16:24
 */
public interface TDzzyService extends IService<TDzzyEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page     分页参数
     * @param tDzzyDTO 查询参数
     * @return IPage<TDzzyVO> tDzzyDTO
     */
    IPage<TDzzyVO> queryPage(Page<TDzzyDTO> page, TDzzyDTO tDzzyDTO);

    /**
     * 查询所有数据
     *
     * @param tDzzyDTO 查询参数
     * @return List<TDzzyVO>
     */
    List<TDzzyVO> queryList(TDzzyDTO tDzzyDTO);
}
