package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TCbswzjlxxDao;
import com.lyc.wwyt.entity.TCbswzjlxxEntity;
import com.lyc.wwyt.dto.TCbswzjlxxDTO;
import com.lyc.wwyt.vo.TCbswzjlxxVO;
import com.lyc.wwyt.service.TCbswzjlxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 承包商违章记录信息表(t_cbswzjlxx)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-19 14:56:51
 */
@Service("tCbswzjlxxService")
@RequiredArgsConstructor
public class TCbswzjlxxServiceImpl extends ServiceImpl<TCbswzjlxxDao, TCbswzjlxxEntity> implements TCbswzjlxxService {

    private final TCbswzjlxxDao tCbswzjlxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page          分页参数
     * @param tCbswzjlxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TCbswzjlxxVO> queryPage(Page<TCbswzjlxxDTO> page, TCbswzjlxxDTO tCbswzjlxxDTO) {
        return this.tCbswzjlxxDao.queryList(page, tCbswzjlxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tCbswzjlxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TCbswzjlxxVO> queryList(TCbswzjlxxDTO tCbswzjlxxDTO) {
        return this.tCbswzjlxxDao.queryList(tCbswzjlxxDTO);
    }
}
