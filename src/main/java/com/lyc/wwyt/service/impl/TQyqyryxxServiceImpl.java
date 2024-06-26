package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TQyqyryxxDao;
import com.lyc.wwyt.dto.TQyqyryxxDTO;
import com.lyc.wwyt.entity.TQyqyryxxEntity;
import com.lyc.wwyt.service.TQyqyryxxService;
import com.lyc.wwyt.vo.TQyqyryxxVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 人员在岗在位信息表(t_qyqyryxx)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:22:32
 */
@Service("tQyqyryxxService")
@RequiredArgsConstructor
public class TQyqyryxxServiceImpl extends ServiceImpl<TQyqyryxxDao, TQyqyryxxEntity> implements TQyqyryxxService {

    private final TQyqyryxxDao tQyqyryxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tQyqyryxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TQyqyryxxVO> queryPage(Page<TQyqyryxxDTO> page, TQyqyryxxDTO tQyqyryxxDTO) {
        return this.tQyqyryxxDao.queryList(page, tQyqyryxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tQyqyryxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TQyqyryxxVO> queryList(TQyqyryxxDTO tQyqyryxxDTO) {
        return this.tQyqyryxxDao.queryList(tQyqyryxxDTO);
    }
}
