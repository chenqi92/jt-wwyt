package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TLsydzyDao;
import com.lyc.wwyt.entity.TLsydzyEntity;
import com.lyc.wwyt.dto.TLsydzyDTO;
import com.lyc.wwyt.vo.TLsydzyVO;
import com.lyc.wwyt.service.TLsydzyService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 临时用电信息表(t_lsydzy)表服务实现类
 *
 * @author lhh
 * @since 2023-05-18 15:54:54
 */
@Service("tLsydzyService")
@RequiredArgsConstructor
public class TLsydzyServiceImpl extends ServiceImpl<TLsydzyDao, TLsydzyEntity> implements TLsydzyService {

    private final TLsydzyDao tLsydzyDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TLsydzyVO> selectList() {
        return this.tLsydzyDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tLsydzyDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TLsydzyVO> selectPage(Page<TLsydzyDTO> page, TLsydzyDTO tLsydzyDTO) {
        return this.tLsydzyDao.selectList(page, tLsydzyDTO);
    }
}
