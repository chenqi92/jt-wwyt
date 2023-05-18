package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TLsydzyAqcsEntity;
import com.lyc.wwyt.dto.TLsydzyAqcsDTO;
import com.lyc.wwyt.vo.TLsydzyAqcsVO;

import java.util.List;

/**
 * 临时用电安全措施表(t_lsydzy_aqcs)表服务接口
 *
 * @author lhh
 * @since 2023-05-18 15:54:56
 */
public interface TLsydzyAqcsService extends IService<TLsydzyAqcsEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TLsydzyAqcsVO>
     */
    List<TLsydzyAqcsVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tLsydzyAqcsDTO 查询参数
     * @return IPage<TLsydzyAqcsVO> tLsydzyAqcsDTO
     */
    IPage<TLsydzyAqcsVO> selectPage(Page<TLsydzyAqcsDTO> page, TLsydzyAqcsDTO tLsydzyAqcsDTO);
}
