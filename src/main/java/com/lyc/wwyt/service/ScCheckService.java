package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.dto.ScCheckDTO;
import com.lyc.wwyt.entity.ScCheckEntity;
import com.lyc.wwyt.entity.TYhzlxxEntity;
import com.lyc.wwyt.vo.ScCheckVO;

import java.util.List;

/**
 * 安全_安全风险、隐患管理(sc_check)表服务接口
 *
 * @author chenqi
 * @since 2023-06-01 17:50:57
 */
public interface ScCheckService extends IService<ScCheckEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param scCheckDTO 查询参数
     * @return IPage<ScCheckVO> scCheckDTO
     */
    IPage<ScCheckVO> queryPage(Page<ScCheckDTO> page, ScCheckDTO scCheckDTO);

    /**
     * 查询所有数据
     *
     * @param scCheckDTO 查询参数
     * @return List<ScCheckVO>
     */
    List<ScCheckVO> queryList(ScCheckDTO scCheckDTO);

    /**
     * 储存sc_check表
     *
     * @param entityList
     */
    void saveOrUpdateCheckInfo(List<TYhzlxxEntity> entityList);
}
