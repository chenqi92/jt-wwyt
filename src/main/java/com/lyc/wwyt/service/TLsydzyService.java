package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.dto.TLsydzyDTO;
import com.lyc.wwyt.entity.TLsydzyEntity;
import com.lyc.wwyt.vo.TLsydzyVO;

import java.util.List;

/**
 * 临时用电信息表(t_lsydzy)表服务接口
 *
 * @author lhh
 * @since 2023-05-22 14:22:29
 */
public interface TLsydzyService extends IService<TLsydzyEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tLsydzyDTO 查询参数
     * @return IPage<TLsydzyVO> tLsydzyDTO
     */
    IPage<TLsydzyVO> queryPage(Page<TLsydzyDTO> page, TLsydzyDTO tLsydzyDTO);

    /**
     * 查询所有数据
     *
     * @param tLsydzyDTO 查询参数
     * @return List<TLsydzyVO>
     */
    List<TLsydzyVO> queryList(TLsydzyDTO tLsydzyDTO);
}
