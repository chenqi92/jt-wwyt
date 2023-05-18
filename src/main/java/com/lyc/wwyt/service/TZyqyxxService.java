package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TZyqyxxEntity;
import com.lyc.wwyt.dto.TZyqyxxDTO;
import com.lyc.wwyt.vo.TZyqyxxVO;

import java.util.List;

/**
 * 作业区域信息表(t_zyqyxx)表服务接口
 *
 * @author lhh
 * @since 2023-05-18 16:44:13
 */
public interface TZyqyxxService extends IService<TZyqyxxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TZyqyxxVO>
     */
    List<TZyqyxxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tZyqyxxDTO 查询参数
     * @return IPage<TZyqyxxVO> tZyqyxxDTO
     */
    IPage<TZyqyxxVO> selectPage(Page<TZyqyxxDTO> page, TZyqyxxDTO tZyqyxxDTO);
}
