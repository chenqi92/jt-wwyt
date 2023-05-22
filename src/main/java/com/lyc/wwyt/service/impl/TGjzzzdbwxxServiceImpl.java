package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TGjzzzdbwxxDao;
import com.lyc.wwyt.entity.TGjzzzdbwxxEntity;
import com.lyc.wwyt.dto.TGjzzzdbwxxDTO;
import com.lyc.wwyt.vo.TGjzzzdbwxxVO;
import com.lyc.wwyt.service.TGjzzzdbwxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 关键装置重点部位信息表(t_gjzzzdbwxx)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:16:27
 */
@Service("tGjzzzdbwxxService")
@RequiredArgsConstructor
public class TGjzzzdbwxxServiceImpl extends ServiceImpl<TGjzzzdbwxxDao, TGjzzzdbwxxEntity> implements TGjzzzdbwxxService {

    private final TGjzzzdbwxxDao tGjzzzdbwxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tGjzzzdbwxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TGjzzzdbwxxVO> queryPage(Page<TGjzzzdbwxxDTO> page, TGjzzzdbwxxDTO tGjzzzdbwxxDTO) {
        return this.tGjzzzdbwxxDao.queryList(page, tGjzzzdbwxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tGjzzzdbwxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TGjzzzdbwxxVO> queryList(TGjzzzdbwxxDTO tGjzzzdbwxxDTO) {
        return this.tGjzzzdbwxxDao.queryList(tGjzzzdbwxxDTO);
    }
}
