package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TYhzlxxDao;
import com.lyc.wwyt.entity.TYhzlxxEntity;
import com.lyc.wwyt.dto.TYhzlxxDTO;
import com.lyc.wwyt.vo.TYhzlxxVO;
import com.lyc.wwyt.service.TYhzlxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 隐患治理信息表(t_yhzlxx)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-19 14:56:41
 */
@Service("tYhzlxxService")
@RequiredArgsConstructor
public class TYhzlxxServiceImpl extends ServiceImpl<TYhzlxxDao, TYhzlxxEntity> implements TYhzlxxService {

    private final TYhzlxxDao tYhzlxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tYhzlxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TYhzlxxVO> queryPage(Page<TYhzlxxDTO> page, TYhzlxxDTO tYhzlxxDTO) {
        return this.tYhzlxxDao.queryList(page, tYhzlxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tYhzlxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TYhzlxxVO> queryList(TYhzlxxDTO tYhzlxxDTO) {
        return this.tYhzlxxDao.queryList(tYhzlxxDTO);
    }
}
