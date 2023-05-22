package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TJcpcsdxxDao;
import com.lyc.wwyt.entity.TJcpcsdxxEntity;
import com.lyc.wwyt.dto.TJcpcsdxxDTO;
import com.lyc.wwyt.vo.TJcpcsdxxVO;
import com.lyc.wwyt.service.TJcpcsdxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 检查频次设定信息表(t_jcpcsdxx)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:16:27
 */
@Service("tJcpcsdxxService")
@RequiredArgsConstructor
public class TJcpcsdxxServiceImpl extends ServiceImpl<TJcpcsdxxDao, TJcpcsdxxEntity> implements TJcpcsdxxService {

    private final TJcpcsdxxDao tJcpcsdxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tJcpcsdxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TJcpcsdxxVO> queryPage(Page<TJcpcsdxxDTO> page, TJcpcsdxxDTO tJcpcsdxxDTO) {
        return this.tJcpcsdxxDao.queryList(page, tJcpcsdxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tJcpcsdxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TJcpcsdxxVO> queryList(TJcpcsdxxDTO tJcpcsdxxDTO) {
        return this.tJcpcsdxxDao.queryList(tJcpcsdxxDTO);
    }
}
