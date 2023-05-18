package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TDwjcxxDao;
import com.lyc.wwyt.entity.TDwjcxxEntity;
import com.lyc.wwyt.dto.TDwjcxxDTO;
import com.lyc.wwyt.vo.TDwjcxxVO;
import com.lyc.wwyt.service.TDwjcxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 点位检查信息表(t_dwjcxx)表服务实现类
 *
 * @author lhh
 * @since 2023-05-17 17:22:13
 */
@Service("tDwjcxxService")
@RequiredArgsConstructor
public class TDwjcxxServiceImpl extends ServiceImpl<TDwjcxxDao, TDwjcxxEntity> implements TDwjcxxService {

    private final TDwjcxxDao tDwjcxxDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TDwjcxxVO> selectList() {
        return this.tDwjcxxDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tDwjcxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TDwjcxxVO> selectPage(Page<TDwjcxxDTO> page, TDwjcxxDTO tDwjcxxDTO) {
        return this.tDwjcxxDao.selectList(page, tDwjcxxDTO);
    }
}
