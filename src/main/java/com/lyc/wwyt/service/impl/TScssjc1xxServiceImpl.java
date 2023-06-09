package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TScssjc1xxDao;
import com.lyc.wwyt.dto.TScssjc1xxDTO;
import com.lyc.wwyt.entity.TScssjc1xxEntity;
import com.lyc.wwyt.service.TScssjc1xxService;
import com.lyc.wwyt.vo.TScssjc1xxVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 生产设施检测信息(t_scssjc1xx)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:22:34
 */
@Service("tScssjc1xxService")
@RequiredArgsConstructor
public class TScssjc1xxServiceImpl extends ServiceImpl<TScssjc1xxDao, TScssjc1xxEntity> implements TScssjc1xxService {

    private final TScssjc1xxDao tScssjc1xxDao;

    /**
     * 分页查询所有数据
     *
     * @param page          分页参数
     * @param tScssjc1xxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TScssjc1xxVO> queryPage(Page<TScssjc1xxDTO> page, TScssjc1xxDTO tScssjc1xxDTO) {
        return this.tScssjc1xxDao.queryList(page, tScssjc1xxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tScssjc1xxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TScssjc1xxVO> queryList(TScssjc1xxDTO tScssjc1xxDTO) {
        return this.tScssjc1xxDao.queryList(tScssjc1xxDTO);
    }
}
