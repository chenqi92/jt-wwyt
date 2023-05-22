package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TDwjzglxxDao;
import com.lyc.wwyt.entity.TDwjzglxxEntity;
import com.lyc.wwyt.dto.TDwjzglxxDTO;
import com.lyc.wwyt.vo.TDwjzglxxVO;
import com.lyc.wwyt.service.TDwjzglxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 定位基站管理信息表(t_dwjzglxx)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:16:23
 */
@Service("tDwjzglxxService")
@RequiredArgsConstructor
public class TDwjzglxxServiceImpl extends ServiceImpl<TDwjzglxxDao, TDwjzglxxEntity> implements TDwjzglxxService {

    private final TDwjzglxxDao tDwjzglxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDwjzglxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TDwjzglxxVO> queryPage(Page<TDwjzglxxDTO> page, TDwjzglxxDTO tDwjzglxxDTO) {
        return this.tDwjzglxxDao.queryList(page, tDwjzglxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tDwjzglxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TDwjzglxxVO> queryList(TDwjzglxxDTO tDwjzglxxDTO) {
        return this.tDwjzglxxDao.queryList(tDwjzglxxDTO);
    }
}
