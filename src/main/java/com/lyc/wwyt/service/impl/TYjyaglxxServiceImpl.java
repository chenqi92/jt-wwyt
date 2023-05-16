package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TYjyaglxxDao;
import com.lyc.wwyt.entity.TYjyaglxxEntity;
import com.lyc.wwyt.dto.TYjyaglxxDTO;
import com.lyc.wwyt.vo.TYjyaglxxVO;
import com.lyc.wwyt.service.TYjyaglxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 应急预案管理信息表(t_yjyaglxx)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:41
 */
@Service("tYjyaglxxService")
@RequiredArgsConstructor
public class TYjyaglxxServiceImpl extends ServiceImpl<TYjyaglxxDao, TYjyaglxxEntity> implements TYjyaglxxService {

    private final TYjyaglxxDao tYjyaglxxDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TYjyaglxxVO> selectList() {
        return this.tYjyaglxxDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tYjyaglxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TYjyaglxxVO> selectPage(Page<TYjyaglxxDTO> page, TYjyaglxxDTO tYjyaglxxDTO) {
        return this.tYjyaglxxDao.selectList(page, tYjyaglxxDTO);
    }
}
