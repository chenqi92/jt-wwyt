package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TDlzyDao;
import com.lyc.wwyt.entity.TDlzyEntity;
import com.lyc.wwyt.dto.TDlzyDTO;
import com.lyc.wwyt.vo.TDlzyVO;
import com.lyc.wwyt.service.TDlzyService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 断路作业信息表(t_dlzy)表服务实现类
 *
 * @author lhh
 * @since 2023-05-18 15:54:27
 */
@Service("tDlzyService")
@RequiredArgsConstructor
public class TDlzyServiceImpl extends ServiceImpl<TDlzyDao, TDlzyEntity> implements TDlzyService {

    private final TDlzyDao tDlzyDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TDlzyVO> selectList() {
        return this.tDlzyDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page     分页参数
     * @param tDlzyDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TDlzyVO> selectPage(Page<TDlzyDTO> page, TDlzyDTO tDlzyDTO) {
        return this.tDlzyDao.selectList(page, tDlzyDTO);
    }
}
