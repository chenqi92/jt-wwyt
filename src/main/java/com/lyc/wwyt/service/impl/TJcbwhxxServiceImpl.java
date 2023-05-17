package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TJcbwhxxDao;
import com.lyc.wwyt.entity.TJcbwhxxEntity;
import com.lyc.wwyt.dto.TJcbwhxxDTO;
import com.lyc.wwyt.vo.TJcbwhxxVO;
import com.lyc.wwyt.service.TJcbwhxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 安全检查表维护信息表结构(t_jcbwhxx)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-17 16:22:40
 */
@Service("tJcbwhxxService")
@RequiredArgsConstructor
public class TJcbwhxxServiceImpl extends ServiceImpl<TJcbwhxxDao, TJcbwhxxEntity> implements TJcbwhxxService {

    private final TJcbwhxxDao tJcbwhxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page        分页参数
     * @param tJcbwhxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TJcbwhxxVO> queryPage(Page<TJcbwhxxDTO> page, TJcbwhxxDTO tJcbwhxxDTO) {
        return this.tJcbwhxxDao.queryList(page, tJcbwhxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tJcbwhxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TJcbwhxxVO> queryList(TJcbwhxxDTO tJcbwhxxDTO) {
        return this.tJcbwhxxDao.queryList(tJcbwhxxDTO);
    }
}
