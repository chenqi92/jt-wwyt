package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TYhpcrwxxDao;
import com.lyc.wwyt.entity.TYhpcrwxxEntity;
import com.lyc.wwyt.dto.TYhpcrwxxDTO;
import com.lyc.wwyt.vo.TYhpcrwxxVO;
import com.lyc.wwyt.service.TYhpcrwxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 隐患排查任务信息表(t_yhpcrwxx)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:53
 */
@Service("tYhpcrwxxService")
@RequiredArgsConstructor
public class TYhpcrwxxServiceImpl extends ServiceImpl<TYhpcrwxxDao, TYhpcrwxxEntity> implements TYhpcrwxxService {

    private final TYhpcrwxxDao tYhpcrwxxDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TYhpcrwxxVO> selectList() {
        return this.tYhpcrwxxDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tYhpcrwxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TYhpcrwxxVO> selectPage(Page<TYhpcrwxxDTO> page, TYhpcrwxxDTO tYhpcrwxxDTO) {
        return this.tYhpcrwxxDao.selectList(page, tYhpcrwxxDTO);
    }
}
