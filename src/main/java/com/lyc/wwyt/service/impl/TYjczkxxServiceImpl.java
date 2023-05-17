package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TYjczkxxDao;
import com.lyc.wwyt.entity.TYjczkxxEntity;
import com.lyc.wwyt.dto.TYjczkxxDTO;
import com.lyc.wwyt.vo.TYjczkxxVO;
import com.lyc.wwyt.service.TYjczkxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 应急处置卡信息表：t_yjczkxx(t_yjczkxx)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:39
 */
@Service("tYjczkxxService")
@RequiredArgsConstructor
public class TYjczkxxServiceImpl extends ServiceImpl<TYjczkxxDao, TYjczkxxEntity> implements TYjczkxxService {

    private final TYjczkxxDao tYjczkxxDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TYjczkxxVO> selectList() {
        return this.tYjczkxxDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page        分页参数
     * @param tYjczkxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TYjczkxxVO> selectPage(Page<TYjczkxxDTO> page, TYjczkxxDTO tYjczkxxDTO) {
        return this.tYjczkxxDao.selectList(page, tYjczkxxDTO);
    }
}
