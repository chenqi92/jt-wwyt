package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TGysglxxDao;
import com.lyc.wwyt.entity.TGysglxxEntity;
import com.lyc.wwyt.dto.TGysglxxDTO;
import com.lyc.wwyt.vo.TGysglxxVO;
import com.lyc.wwyt.service.TGysglxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 供应商管理信息表(t_gysglxx)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-19 14:56:39
 */
@Service("tGysglxxService")
@RequiredArgsConstructor
public class TGysglxxServiceImpl extends ServiceImpl<TGysglxxDao, TGysglxxEntity> implements TGysglxxService {

    private final TGysglxxDao tGysglxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page        分页参数
     * @param tGysglxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TGysglxxVO> queryPage(Page<TGysglxxDTO> page, TGysglxxDTO tGysglxxDTO) {
        return this.tGysglxxDao.queryList(page, tGysglxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tGysglxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TGysglxxVO> queryList(TGysglxxDTO tGysglxxDTO) {
        return this.tGysglxxDao.queryList(tGysglxxDTO);
    }
}
