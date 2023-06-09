package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TZdwxyglxxDao;
import com.lyc.wwyt.dto.TZdwxyglxxDTO;
import com.lyc.wwyt.entity.TZdwxyglxxEntity;
import com.lyc.wwyt.service.TZdwxyglxxService;
import com.lyc.wwyt.vo.TZdwxyglxxVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 重大危险源管理信息表(t_zdwxyglxx)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:22:39
 */
@Service("tZdwxyglxxService")
@RequiredArgsConstructor
public class TZdwxyglxxServiceImpl extends ServiceImpl<TZdwxyglxxDao, TZdwxyglxxEntity> implements TZdwxyglxxService {

    private final TZdwxyglxxDao tZdwxyglxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page          分页参数
     * @param tZdwxyglxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TZdwxyglxxVO> queryPage(Page<TZdwxyglxxDTO> page, TZdwxyglxxDTO tZdwxyglxxDTO) {
        return this.tZdwxyglxxDao.queryList(page, tZdwxyglxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tZdwxyglxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TZdwxyglxxVO> queryList(TZdwxyglxxDTO tZdwxyglxxDTO) {
        return this.tZdwxyglxxDao.queryList(tZdwxyglxxDTO);
    }
}
