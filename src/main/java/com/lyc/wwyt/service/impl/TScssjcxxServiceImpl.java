package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TScssjcxxDao;
import com.lyc.wwyt.dto.TScssjcxxDTO;
import com.lyc.wwyt.entity.TScssjcxxEntity;
import com.lyc.wwyt.service.TScssjcxxService;
import com.lyc.wwyt.vo.TScssjcxxVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 生产设施检查信息(t_scssjcxx)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:22:36
 */
@Service("tScssjcxxService")
@RequiredArgsConstructor
public class TScssjcxxServiceImpl extends ServiceImpl<TScssjcxxDao, TScssjcxxEntity> implements TScssjcxxService {

    private final TScssjcxxDao tScssjcxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tScssjcxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TScssjcxxVO> queryPage(Page<TScssjcxxDTO> page, TScssjcxxDTO tScssjcxxDTO) {
        return this.tScssjcxxDao.queryList(page, tScssjcxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tScssjcxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TScssjcxxVO> queryList(TScssjcxxDTO tScssjcxxDTO) {
        return this.tScssjcxxDao.queryList(tScssjcxxDTO);
    }
}
