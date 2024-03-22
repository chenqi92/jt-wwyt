package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TZyqyxxDao;
import com.lyc.wwyt.dto.TZyqyxxDTO;
import com.lyc.wwyt.entity.TZyqyxxEntity;
import com.lyc.wwyt.service.TZyqyxxService;
import com.lyc.wwyt.vo.TZyqyxxVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作业区域信息表(t_zyqyxx)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:22:39
 */
@Service("tZyqyxxService")
@RequiredArgsConstructor
public class TZyqyxxServiceImpl extends ServiceImpl<TZyqyxxDao, TZyqyxxEntity> implements TZyqyxxService {

    private final TZyqyxxDao tZyqyxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tZyqyxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TZyqyxxVO> queryPage(Page<TZyqyxxDTO> page, TZyqyxxDTO tZyqyxxDTO) {
        return this.tZyqyxxDao.queryList(page, tZyqyxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tZyqyxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TZyqyxxVO> queryList(TZyqyxxDTO tZyqyxxDTO) {
        return this.tZyqyxxDao.queryList(tZyqyxxDTO);
    }
}
