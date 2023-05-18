package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TScssbfxxEntity;
import com.lyc.wwyt.dto.TScssbfxxDTO;
import com.lyc.wwyt.vo.TScssbfxxVO;

import java.util.List;

/**
 * 生产设备报废信息(t_scssbfxx)表服务接口
 *
 * @author lhh
 * @since 2023-05-17 17:22:09
 */
public interface TScssbfxxService extends IService<TScssbfxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TScssbfxxVO>
     */
    List<TScssbfxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tScssbfxxDTO 查询参数
     * @return IPage<TScssbfxxVO> tScssbfxxDTO
     */
    IPage<TScssbfxxVO> selectPage(Page<TScssbfxxDTO> page, TScssbfxxDTO tScssbfxxDTO);
}
