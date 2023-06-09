package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TQyfxfbxxDao;
import com.lyc.wwyt.dto.TQyfxfbxxDTO;
import com.lyc.wwyt.entity.TQyfxfbxxEntity;
import com.lyc.wwyt.service.TQyfxfbxxService;
import com.lyc.wwyt.vo.TQyfxfbxxVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 企业安全风险分布信息表(t_qyfxfbxx)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-19 14:56:38
 */
@Service("tQyfxfbxxService")
@RequiredArgsConstructor
public class TQyfxfbxxServiceImpl extends ServiceImpl<TQyfxfbxxDao, TQyfxfbxxEntity> implements TQyfxfbxxService {

    private final TQyfxfbxxDao tQyfxfbxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tQyfxfbxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TQyfxfbxxVO> queryPage(Page<TQyfxfbxxDTO> page, TQyfxfbxxDTO tQyfxfbxxDTO) {
        return this.tQyfxfbxxDao.queryList(page, tQyfxfbxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tQyfxfbxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TQyfxfbxxVO> queryList(TQyfxfbxxDTO tQyfxfbxxDTO) {
        return this.tQyfxfbxxDao.queryList(tQyfxfbxxDTO);
    }
}
