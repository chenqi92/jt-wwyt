package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TCbszyscEntity;
import com.lyc.wwyt.dto.TCbszyscDTO;
import com.lyc.wwyt.vo.TCbszyscVO;

import java.util.List;

/**
 * 承包商安全作业规程审查表(t_cbszysc)表服务接口
 *
 * @author chenqi
 * @since 2023-05-17 16:22:45
 */
public interface TCbszyscService extends IService<TCbszyscEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page        分页参数
     * @param tCbszyscDTO 查询参数
     * @return IPage<TCbszyscVO> tCbszyscDTO
     */
    IPage<TCbszyscVO> queryPage(Page<TCbszyscDTO> page, TCbszyscDTO tCbszyscDTO);

    /**
     * 查询所有数据
     *
     * @param tCbszyscDTO 查询参数
     * @return List<TCbszyscVO>
     */
    List<TCbszyscVO> queryList(TCbszyscDTO tCbszyscDTO);
}
