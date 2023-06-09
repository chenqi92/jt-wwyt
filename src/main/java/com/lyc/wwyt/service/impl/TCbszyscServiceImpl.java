package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TCbszyscDao;
import com.lyc.wwyt.dto.TCbszyscDTO;
import com.lyc.wwyt.entity.TCbszyscEntity;
import com.lyc.wwyt.service.TCbszyscService;
import com.lyc.wwyt.vo.TCbszyscVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 承包商安全作业规程审查表(t_cbszysc)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-19 14:56:39
 */
@Service("tCbszyscService")
@RequiredArgsConstructor
public class TCbszyscServiceImpl extends ServiceImpl<TCbszyscDao, TCbszyscEntity> implements TCbszyscService {

    private final TCbszyscDao tCbszyscDao;

    /**
     * 分页查询所有数据
     *
     * @param page        分页参数
     * @param tCbszyscDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TCbszyscVO> queryPage(Page<TCbszyscDTO> page, TCbszyscDTO tCbszyscDTO) {
        return this.tCbszyscDao.queryList(page, tCbszyscDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tCbszyscDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TCbszyscVO> queryList(TCbszyscDTO tCbszyscDTO) {
        return this.tCbszyscDao.queryList(tCbszyscDTO);
    }
}
