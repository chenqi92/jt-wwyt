package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TQyfxfbxxDao;
import com.lyc.wwyt.entity.TQyfxfbxxEntity;
import com.lyc.wwyt.dto.TQyfxfbxxDTO;
import com.lyc.wwyt.vo.TQyfxfbxxVO;
import com.lyc.wwyt.service.TQyfxfbxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 企业安全风险分布信息表(t_qyfxfbxx)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:59
 */
@Service("tQyfxfbxxService")
@RequiredArgsConstructor
public class TQyfxfbxxServiceImpl extends ServiceImpl<TQyfxfbxxDao, TQyfxfbxxEntity> implements TQyfxfbxxService {

    private final TQyfxfbxxDao tQyfxfbxxDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TQyfxfbxxVO> selectList() {
        return this.tQyfxfbxxDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tQyfxfbxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TQyfxfbxxVO> selectPage(Page<TQyfxfbxxDTO> page, TQyfxfbxxDTO tQyfxfbxxDTO) {
        return this.tQyfxfbxxDao.selectList(page, tQyfxfbxxDTO);
    }
}
