package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TAqsczrclkxxDao;
import com.lyc.wwyt.entity.TAqsczrclkxxEntity;
import com.lyc.wwyt.dto.TAqsczrclkxxDTO;
import com.lyc.wwyt.vo.TAqsczrclkxxVO;
import com.lyc.wwyt.service.TAqsczrclkxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 安全生产责任承诺卡信息表(t_aqsczrclkxx)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-17 16:22:45
 */
@Service("tAqsczrclkxxService")
@RequiredArgsConstructor
public class TAqsczrclkxxServiceImpl extends ServiceImpl<TAqsczrclkxxDao, TAqsczrclkxxEntity> implements TAqsczrclkxxService {

    private final TAqsczrclkxxDao tAqsczrclkxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page            分页参数
     * @param tAqsczrclkxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TAqsczrclkxxVO> queryPage(Page<TAqsczrclkxxDTO> page, TAqsczrclkxxDTO tAqsczrclkxxDTO) {
        return this.tAqsczrclkxxDao.queryList(page, tAqsczrclkxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tAqsczrclkxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TAqsczrclkxxVO> queryList(TAqsczrclkxxDTO tAqsczrclkxxDTO) {
        return this.tAqsczrclkxxDao.queryList(tAqsczrclkxxDTO);
    }
}
