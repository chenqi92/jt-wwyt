package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TQzpxdaDao;
import com.lyc.wwyt.dto.TQzpxdaDTO;
import com.lyc.wwyt.entity.TQzpxdaEntity;
import com.lyc.wwyt.service.TQzpxdaService;
import com.lyc.wwyt.vo.TQzpxdaVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 取证培训档案表(t_qzpxda)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-19 14:56:46
 */
@Service("tQzpxdaService")
@RequiredArgsConstructor
public class TQzpxdaServiceImpl extends ServiceImpl<TQzpxdaDao, TQzpxdaEntity> implements TQzpxdaService {

    private final TQzpxdaDao tQzpxdaDao;

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tQzpxdaDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TQzpxdaVO> queryPage(Page<TQzpxdaDTO> page, TQzpxdaDTO tQzpxdaDTO) {
        return this.tQzpxdaDao.queryList(page, tQzpxdaDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tQzpxdaDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TQzpxdaVO> queryList(TQzpxdaDTO tQzpxdaDTO) {
        return this.tQzpxdaDao.queryList(tQzpxdaDTO);
    }
}
