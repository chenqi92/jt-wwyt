package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TScsswxxxEntity;
import com.lyc.wwyt.dto.TScsswxxxDTO;
import com.lyc.wwyt.vo.TScsswxxxVO;

import java.util.List;

/**
 * 生产设施维修信息(t_scsswxxx)表服务接口
 *
 * @author lhh
 * @since 2023-05-17 17:22:11
 */
public interface TScsswxxxService extends IService<TScsswxxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TScsswxxxVO>
     */
    List<TScsswxxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tScsswxxxDTO 查询参数
     * @return IPage<TScsswxxxVO> tScsswxxxDTO
     */
    IPage<TScsswxxxVO> selectPage(Page<TScsswxxxDTO> page, TScsswxxxDTO tScsswxxxDTO);
}
