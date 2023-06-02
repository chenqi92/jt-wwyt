package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.dto.TScssjc1xxDTO;
import com.lyc.wwyt.entity.TScssjc1xxEntity;
import com.lyc.wwyt.vo.TScssjc1xxVO;

import java.util.List;

/**
 * 生产设施检测信息(t_scssjc1xx)表服务接口
 *
 * @author lhh
 * @since 2023-05-22 14:22:34
 */
public interface TScssjc1xxService extends IService<TScssjc1xxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page          分页参数
     * @param tScssjc1xxDTO 查询参数
     * @return IPage<TScssjc1xxVO> tScssjc1xxDTO
     */
    IPage<TScssjc1xxVO> queryPage(Page<TScssjc1xxDTO> page, TScssjc1xxDTO tScssjc1xxDTO);

    /**
     * 查询所有数据
     *
     * @param tScssjc1xxDTO 查询参数
     * @return List<TScssjc1xxVO>
     */
    List<TScssjc1xxVO> queryList(TScssjc1xxDTO tScssjc1xxDTO);
}
