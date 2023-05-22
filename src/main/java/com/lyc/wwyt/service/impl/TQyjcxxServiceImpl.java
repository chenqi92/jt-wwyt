package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TQyjcxxDao;
import com.lyc.wwyt.entity.TQyjcxxEntity;
import com.lyc.wwyt.dto.TQyjcxxDTO;
import com.lyc.wwyt.vo.TQyjcxxVO;
import com.lyc.wwyt.service.TQyjcxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 企业基础信息表(t_qyjcxx)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:22:31
 */
@Service("tQyjcxxService")
@RequiredArgsConstructor
public class TQyjcxxServiceImpl extends ServiceImpl<TQyjcxxDao, TQyjcxxEntity> implements TQyjcxxService {

    private final TQyjcxxDao tQyjcxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tQyjcxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TQyjcxxVO> queryPage(Page<TQyjcxxDTO> page, TQyjcxxDTO tQyjcxxDTO) {
        return this.tQyjcxxDao.queryList(page, tQyjcxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tQyjcxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TQyjcxxVO> queryList(TQyjcxxDTO tQyjcxxDTO) {
        return this.tQyjcxxDao.queryList(tQyjcxxDTO);
    }
}
