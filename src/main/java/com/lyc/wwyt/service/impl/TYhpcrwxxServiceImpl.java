package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TYhpcrwxxDao;
import com.lyc.wwyt.dto.TYhpcrwxxDTO;
import com.lyc.wwyt.entity.TYhpcrwxxEntity;
import com.lyc.wwyt.service.TYhpcrwxxService;
import com.lyc.wwyt.vo.TYhpcrwxxVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 隐患排查任务信息表(t_yhpcrwxx)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-19 14:56:48
 */
@Service("tYhpcrwxxService")
@RequiredArgsConstructor
public class TYhpcrwxxServiceImpl extends ServiceImpl<TYhpcrwxxDao, TYhpcrwxxEntity> implements TYhpcrwxxService {

    private final TYhpcrwxxDao tYhpcrwxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tYhpcrwxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TYhpcrwxxVO> queryPage(Page<TYhpcrwxxDTO> page, TYhpcrwxxDTO tYhpcrwxxDTO) {
        return this.tYhpcrwxxDao.queryList(page, tYhpcrwxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tYhpcrwxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TYhpcrwxxVO> queryList(TYhpcrwxxDTO tYhpcrwxxDTO) {
        return this.tYhpcrwxxDao.queryList(tYhpcrwxxDTO);
    }
}
