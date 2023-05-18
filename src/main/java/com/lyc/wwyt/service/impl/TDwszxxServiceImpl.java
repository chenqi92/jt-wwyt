package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TDwszxxDao;
import com.lyc.wwyt.entity.TDwszxxEntity;
import com.lyc.wwyt.dto.TDwszxxDTO;
import com.lyc.wwyt.vo.TDwszxxVO;
import com.lyc.wwyt.service.TDwszxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 点位设置信息表(t_dwszxx)表服务实现类
 *
 * @author lhh
 * @since 2023-05-17 17:22:13
 */
@Service("tDwszxxService")
@RequiredArgsConstructor
public class TDwszxxServiceImpl extends ServiceImpl<TDwszxxDao, TDwszxxEntity> implements TDwszxxService {

    private final TDwszxxDao tDwszxxDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TDwszxxVO> selectList() {
        return this.tDwszxxDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tDwszxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TDwszxxVO> selectPage(Page<TDwszxxDTO> page, TDwszxxDTO tDwszxxDTO) {
        return this.tDwszxxDao.selectList(page, tDwszxxDTO);
    }
}
