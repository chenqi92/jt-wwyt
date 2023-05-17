package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TYjdwglxxDao;
import com.lyc.wwyt.entity.TYjdwglxxEntity;
import com.lyc.wwyt.dto.TYjdwglxxDTO;
import com.lyc.wwyt.vo.TYjdwglxxVO;
import com.lyc.wwyt.service.TYjdwglxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 应急队伍管理信息表(t_yjdwglxx)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-17 16:22:39
 */
@Service("tYjdwglxxService")
@RequiredArgsConstructor
public class TYjdwglxxServiceImpl extends ServiceImpl<TYjdwglxxDao, TYjdwglxxEntity> implements TYjdwglxxService {

    private final TYjdwglxxDao tYjdwglxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tYjdwglxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TYjdwglxxVO> queryPage(Page<TYjdwglxxDTO> page, TYjdwglxxDTO tYjdwglxxDTO) {
        return this.tYjdwglxxDao.queryList(page, tYjdwglxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tYjdwglxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TYjdwglxxVO> queryList(TYjdwglxxDTO tYjdwglxxDTO) {
        return this.tYjdwglxxDao.queryList(tYjdwglxxDTO);
    }
}
