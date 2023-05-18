package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TZyqyxxDao;
import com.lyc.wwyt.entity.TZyqyxxEntity;
import com.lyc.wwyt.dto.TZyqyxxDTO;
import com.lyc.wwyt.vo.TZyqyxxVO;
import com.lyc.wwyt.service.TZyqyxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 作业区域信息表(t_zyqyxx)表服务实现类
 *
 * @author lhh
 * @since 2023-05-18 16:44:13
 */
@Service("tZyqyxxService")
@RequiredArgsConstructor
public class TZyqyxxServiceImpl extends ServiceImpl<TZyqyxxDao, TZyqyxxEntity> implements TZyqyxxService {

    private final TZyqyxxDao tZyqyxxDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TZyqyxxVO> selectList() {
        return this.tZyqyxxDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tZyqyxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TZyqyxxVO> selectPage(Page<TZyqyxxDTO> page, TZyqyxxDTO tZyqyxxDTO) {
        return this.tZyqyxxDao.selectList(page, tZyqyxxDTO);
    }
}
