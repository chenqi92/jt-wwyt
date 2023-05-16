package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TFxsstxxDao;
import com.lyc.wwyt.entity.TFxsstxxEntity;
import com.lyc.wwyt.dto.TFxsstxxDTO;
import com.lyc.wwyt.vo.TFxsstxxVO;
import com.lyc.wwyt.service.TFxsstxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 风险四色图信息表(t_fxsstxx)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:39
 */
@Service("tFxsstxxService")
@RequiredArgsConstructor
public class TFxsstxxServiceImpl extends ServiceImpl<TFxsstxxDao, TFxsstxxEntity> implements TFxsstxxService {

    private final TFxsstxxDao tFxsstxxDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TFxsstxxVO> selectList() {
        return this.tFxsstxxDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page        分页参数
     * @param tFxsstxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TFxsstxxVO> selectPage(Page<TFxsstxxDTO> page, TFxsstxxDTO tFxsstxxDTO) {
        return this.tFxsstxxDao.selectList(page, tFxsstxxDTO);
    }
}
