package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TScssbfxxDao;
import com.lyc.wwyt.entity.TScssbfxxEntity;
import com.lyc.wwyt.dto.TScssbfxxDTO;
import com.lyc.wwyt.vo.TScssbfxxVO;
import com.lyc.wwyt.service.TScssbfxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 生产设备报废信息(t_scssbfxx)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:22:33
 */
@Service("tScssbfxxService")
@RequiredArgsConstructor
public class TScssbfxxServiceImpl extends ServiceImpl<TScssbfxxDao, TScssbfxxEntity> implements TScssbfxxService {

    private final TScssbfxxDao tScssbfxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tScssbfxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TScssbfxxVO> queryPage(Page<TScssbfxxDTO> page, TScssbfxxDTO tScssbfxxDTO) {
        return this.tScssbfxxDao.queryList(page, tScssbfxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tScssbfxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TScssbfxxVO> queryList(TScssbfxxDTO tScssbfxxDTO) {
        return this.tScssbfxxDao.queryList(tScssbfxxDTO);
    }
}
