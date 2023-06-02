package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TYjyljhxxDao;
import com.lyc.wwyt.dto.TYjyljhxxDTO;
import com.lyc.wwyt.entity.TYjyljhxxEntity;
import com.lyc.wwyt.service.TYjyljhxxService;
import com.lyc.wwyt.vo.TYjyljhxxVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 应急演练计划信息表(t_yjyljhxx)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-19 14:56:43
 */
@Service("tYjyljhxxService")
@RequiredArgsConstructor
public class TYjyljhxxServiceImpl extends ServiceImpl<TYjyljhxxDao, TYjyljhxxEntity> implements TYjyljhxxService {

    private final TYjyljhxxDao tYjyljhxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tYjyljhxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TYjyljhxxVO> queryPage(Page<TYjyljhxxDTO> page, TYjyljhxxDTO tYjyljhxxDTO) {
        return this.tYjyljhxxDao.queryList(page, tYjyljhxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tYjyljhxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TYjyljhxxVO> queryList(TYjyljhxxDTO tYjyljhxxDTO) {
        return this.tYjyljhxxDao.queryList(tYjyljhxxDTO);
    }
}
