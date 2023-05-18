package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TBjxxglxxDao;
import com.lyc.wwyt.entity.TBjxxglxxEntity;
import com.lyc.wwyt.dto.TBjxxglxxDTO;
import com.lyc.wwyt.vo.TBjxxglxxVO;
import com.lyc.wwyt.service.TBjxxglxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 报警信息管理信息表(t_bjxxglxx)表服务实现类
 *
 * @author lhh
 * @since 2023-05-18 16:32:23
 */
@Service("tBjxxglxxService")
@RequiredArgsConstructor
public class TBjxxglxxServiceImpl extends ServiceImpl<TBjxxglxxDao, TBjxxglxxEntity> implements TBjxxglxxService {

    private final TBjxxglxxDao tBjxxglxxDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TBjxxglxxVO> selectList() {
        return this.tBjxxglxxDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tBjxxglxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TBjxxglxxVO> selectPage(Page<TBjxxglxxDTO> page, TBjxxglxxDTO tBjxxglxxDTO) {
        return this.tBjxxglxxDao.selectList(page, tBjxxglxxDTO);
    }
}
