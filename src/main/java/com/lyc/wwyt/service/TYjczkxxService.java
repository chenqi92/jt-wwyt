package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TYjczkxxEntity;
import com.lyc.wwyt.dto.TYjczkxxDTO;
import com.lyc.wwyt.vo.TYjczkxxVO;

import java.util.List;

/**
 * 应急处置卡信息表：t_yjczkxx(t_yjczkxx)表服务接口
 *
 * @author chenqi
 * @since 2023-05-19 14:56:41
 */
public interface TYjczkxxService extends IService<TYjczkxxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page        分页参数
     * @param tYjczkxxDTO 查询参数
     * @return IPage<TYjczkxxVO> tYjczkxxDTO
     */
    IPage<TYjczkxxVO> queryPage(Page<TYjczkxxDTO> page, TYjczkxxDTO tYjczkxxDTO);

    /**
     * 查询所有数据
     *
     * @param tYjczkxxDTO 查询参数
     * @return List<TYjczkxxVO>
     */
    List<TYjczkxxVO> queryList(TYjczkxxDTO tYjczkxxDTO);
}
