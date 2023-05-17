package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TYjwzglxxDao;
import com.lyc.wwyt.entity.TYjwzglxxEntity;
import com.lyc.wwyt.dto.TYjwzglxxDTO;
import com.lyc.wwyt.vo.TYjwzglxxVO;
import com.lyc.wwyt.service.TYjwzglxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 应急物资管理信息表(t_yjwzglxx)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-17 16:22:41
 */
@Service("tYjwzglxxService")
@RequiredArgsConstructor
public class TYjwzglxxServiceImpl extends ServiceImpl<TYjwzglxxDao, TYjwzglxxEntity> implements TYjwzglxxService {

    private final TYjwzglxxDao tYjwzglxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tYjwzglxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TYjwzglxxVO> queryPage(Page<TYjwzglxxDTO> page, TYjwzglxxDTO tYjwzglxxDTO) {
        return this.tYjwzglxxDao.queryList(page, tYjwzglxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tYjwzglxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TYjwzglxxVO> queryList(TYjwzglxxDTO tYjwzglxxDTO) {
        return this.tYjwzglxxDao.queryList(tYjwzglxxDTO);
    }
}
