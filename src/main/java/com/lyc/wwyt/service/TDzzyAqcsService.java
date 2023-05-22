package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TDzzyAqcsEntity;
import com.lyc.wwyt.dto.TDzzyAqcsDTO;
import com.lyc.wwyt.vo.TDzzyAqcsVO;

import java.util.List;

/**
 * 吊装作业安全措施表(t_dzzy_aqcs)表服务接口
 *
 * @author lhh
 * @since 2023-05-22 14:16:24
 */
public interface TDzzyAqcsService extends IService<TDzzyAqcsEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDzzyAqcsDTO 查询参数
     * @return IPage<TDzzyAqcsVO> tDzzyAqcsDTO
     */
    IPage<TDzzyAqcsVO> queryPage(Page<TDzzyAqcsDTO> page, TDzzyAqcsDTO tDzzyAqcsDTO);

    /**
     * 查询所有数据
     *
     * @param tDzzyAqcsDTO 查询参数
     * @return List<TDzzyAqcsVO>
     */
    List<TDzzyAqcsVO> queryList(TDzzyAqcsDTO tDzzyAqcsDTO);
}
