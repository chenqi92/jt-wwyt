package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TBqkzglxxDao;
import com.lyc.wwyt.dto.TBqkzglxxDTO;
import com.lyc.wwyt.entity.TBqkzglxxEntity;
import com.lyc.wwyt.service.TBqkzglxxService;
import com.lyc.wwyt.vo.TBqkzglxxVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 标签扩展管理信息表(t_bqkzglxx)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:13:07
 */
@Service("tBqkzglxxService")
@RequiredArgsConstructor
public class TBqkzglxxServiceImpl extends ServiceImpl<TBqkzglxxDao, TBqkzglxxEntity> implements TBqkzglxxService {

    private final TBqkzglxxDao tBqkzglxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tBqkzglxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TBqkzglxxVO> queryPage(Page<TBqkzglxxDTO> page, TBqkzglxxDTO tBqkzglxxDTO) {
        return this.tBqkzglxxDao.queryList(page, tBqkzglxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tBqkzglxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TBqkzglxxVO> queryList(TBqkzglxxDTO tBqkzglxxDTO) {
        return this.tBqkzglxxDao.queryList(tBqkzglxxDTO);
    }
}
