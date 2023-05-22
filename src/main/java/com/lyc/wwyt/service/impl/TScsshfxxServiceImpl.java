package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TScsshfxxDao;
import com.lyc.wwyt.entity.TScsshfxxEntity;
import com.lyc.wwyt.dto.TScsshfxxDTO;
import com.lyc.wwyt.vo.TScsshfxxVO;
import com.lyc.wwyt.service.TScsshfxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 生产设备恢复信息(t_scsshfxx)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:22:34
 */
@Service("tScsshfxxService")
@RequiredArgsConstructor
public class TScsshfxxServiceImpl extends ServiceImpl<TScsshfxxDao, TScsshfxxEntity> implements TScsshfxxService {

    private final TScsshfxxDao tScsshfxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tScsshfxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TScsshfxxVO> queryPage(Page<TScsshfxxDTO> page, TScsshfxxDTO tScsshfxxDTO) {
        return this.tScsshfxxDao.queryList(page, tScsshfxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tScsshfxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TScsshfxxVO> queryList(TScsshfxxDTO tScsshfxxDTO) {
        return this.tScsshfxxDao.queryList(tScsshfxxDTO);
    }
}
