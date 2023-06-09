package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TXmstsxxDao;
import com.lyc.wwyt.dto.TXmstsxxDTO;
import com.lyc.wwyt.entity.TXmstsxxEntity;
import com.lyc.wwyt.service.TXmstsxxService;
import com.lyc.wwyt.vo.TXmstsxxVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 项目三同时信息表(t_xmstsxx)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:22:38
 */
@Service("tXmstsxxService")
@RequiredArgsConstructor
public class TXmstsxxServiceImpl extends ServiceImpl<TXmstsxxDao, TXmstsxxEntity> implements TXmstsxxService {

    private final TXmstsxxDao tXmstsxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page        分页参数
     * @param tXmstsxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TXmstsxxVO> queryPage(Page<TXmstsxxDTO> page, TXmstsxxDTO tXmstsxxDTO) {
        return this.tXmstsxxDao.queryList(page, tXmstsxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tXmstsxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TXmstsxxVO> queryList(TXmstsxxDTO tXmstsxxDTO) {
        return this.tXmstsxxDao.queryList(tXmstsxxDTO);
    }
}
