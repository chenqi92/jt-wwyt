package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TYjyljhxxDao;
import com.lyc.wwyt.entity.TYjyljhxxEntity;
import com.lyc.wwyt.dto.TYjyljhxxDTO;
import com.lyc.wwyt.vo.TYjyljhxxVO;
import com.lyc.wwyt.service.TYjyljhxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 应急演练计划信息表(t_yjyljhxx)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:41
 */
@Service("tYjyljhxxService")
@RequiredArgsConstructor
public class TYjyljhxxServiceImpl extends ServiceImpl<TYjyljhxxDao, TYjyljhxxEntity> implements TYjyljhxxService {

    private final TYjyljhxxDao tYjyljhxxDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TYjyljhxxVO> selectList() {
        return this.tYjyljhxxDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tYjyljhxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TYjyljhxxVO> selectPage(Page<TYjyljhxxDTO> page, TYjyljhxxDTO tYjyljhxxDTO) {
        return this.tYjyljhxxDao.selectList(page, tYjyljhxxDTO);
    }
}
