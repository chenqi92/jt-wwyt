package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TScsshfxxEntity;
import com.lyc.wwyt.dto.TScsshfxxDTO;
import com.lyc.wwyt.vo.TScsshfxxVO;

import java.util.List;

/**
 * 生产设备恢复信息(t_scsshfxx)表服务接口
 *
 * @author lhh
 * @since 2023-05-17 17:22:10
 */
public interface TScsshfxxService extends IService<TScsshfxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TScsshfxxVO>
     */
    List<TScsshfxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tScsshfxxDTO 查询参数
     * @return IPage<TScsshfxxVO> tScsshfxxDTO
     */
    IPage<TScsshfxxVO> selectPage(Page<TScsshfxxDTO> page, TScsshfxxDTO tScsshfxxDTO);
}
