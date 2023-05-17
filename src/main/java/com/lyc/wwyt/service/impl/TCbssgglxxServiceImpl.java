package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TCbssgglxxDao;
import com.lyc.wwyt.entity.TCbssgglxxEntity;
import com.lyc.wwyt.dto.TCbssgglxxDTO;
import com.lyc.wwyt.vo.TCbssgglxxVO;
import com.lyc.wwyt.service.TCbssgglxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 承包商施工管理信息表(t_cbssgglxx)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-17 16:22:46
 */
@Service("tCbssgglxxService")
@RequiredArgsConstructor
public class TCbssgglxxServiceImpl extends ServiceImpl<TCbssgglxxDao, TCbssgglxxEntity> implements TCbssgglxxService {

    private final TCbssgglxxDao tCbssgglxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page          分页参数
     * @param tCbssgglxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TCbssgglxxVO> queryPage(Page<TCbssgglxxDTO> page, TCbssgglxxDTO tCbssgglxxDTO) {
        return this.tCbssgglxxDao.queryList(page, tCbssgglxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tCbssgglxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TCbssgglxxVO> queryList(TCbssgglxxDTO tCbssgglxxDTO) {
        return this.tCbssgglxxDao.queryList(tCbssgglxxDTO);
    }
}
