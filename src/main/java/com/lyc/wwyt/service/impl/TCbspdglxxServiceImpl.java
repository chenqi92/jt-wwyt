package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TCbspdglxxDao;
import com.lyc.wwyt.entity.TCbspdglxxEntity;
import com.lyc.wwyt.dto.TCbspdglxxDTO;
import com.lyc.wwyt.vo.TCbspdglxxVO;
import com.lyc.wwyt.service.TCbspdglxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 承包商评定管理信息表(t_cbspdglxx)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-17 16:22:39
 */
@Service("tCbspdglxxService")
@RequiredArgsConstructor
public class TCbspdglxxServiceImpl extends ServiceImpl<TCbspdglxxDao, TCbspdglxxEntity> implements TCbspdglxxService {

    private final TCbspdglxxDao tCbspdglxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page          分页参数
     * @param tCbspdglxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TCbspdglxxVO> queryPage(Page<TCbspdglxxDTO> page, TCbspdglxxDTO tCbspdglxxDTO) {
        return this.tCbspdglxxDao.queryList(page, tCbspdglxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tCbspdglxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TCbspdglxxVO> queryList(TCbspdglxxDTO tCbspdglxxDTO) {
        return this.tCbspdglxxDao.queryList(tCbspdglxxDTO);
    }
}
