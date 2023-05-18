package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TScssjcxxEntity;
import com.lyc.wwyt.dto.TScssjcxxDTO;
import com.lyc.wwyt.vo.TScssjcxxVO;

import java.util.List;

/**
 * 生产设施检查信息(t_scssjcxx)表服务接口
 *
 * @author lhh
 * @since 2023-05-17 17:22:11
 */
public interface TScssjcxxService extends IService<TScssjcxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TScssjcxxVO>
     */
    List<TScssjcxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tScssjcxxDTO 查询参数
     * @return IPage<TScssjcxxVO> tScssjcxxDTO
     */
    IPage<TScssjcxxVO> selectPage(Page<TScssjcxxDTO> page, TScssjcxxDTO tScssjcxxDTO);
}
