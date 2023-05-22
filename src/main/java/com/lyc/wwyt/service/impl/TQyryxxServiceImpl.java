package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TQyryxxDao;
import com.lyc.wwyt.entity.TQyryxxEntity;
import com.lyc.wwyt.dto.TQyryxxDTO;
import com.lyc.wwyt.vo.TQyryxxVO;
import com.lyc.wwyt.service.TQyryxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 企业人员信息表(t_qyryxx)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:22:32
 */
@Service("tQyryxxService")
@RequiredArgsConstructor
public class TQyryxxServiceImpl extends ServiceImpl<TQyryxxDao, TQyryxxEntity> implements TQyryxxService {

    private final TQyryxxDao tQyryxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tQyryxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TQyryxxVO> queryPage(Page<TQyryxxDTO> page, TQyryxxDTO tQyryxxDTO) {
        return this.tQyryxxDao.queryList(page, tQyryxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tQyryxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TQyryxxVO> queryList(TQyryxxDTO tQyryxxDTO) {
        return this.tQyryxxDao.queryList(tQyryxxDTO);
    }
}
