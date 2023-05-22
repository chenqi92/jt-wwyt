package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TDhzyAqcsDao;
import com.lyc.wwyt.entity.TDhzyAqcsEntity;
import com.lyc.wwyt.dto.TDhzyAqcsDTO;
import com.lyc.wwyt.vo.TDhzyAqcsVO;
import com.lyc.wwyt.service.TDhzyAqcsService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 动火作业安全措施表(t_dhzy_aqcs)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:13:08
 */
@Service("tDhzyAqcsService")
@RequiredArgsConstructor
public class TDhzyAqcsServiceImpl extends ServiceImpl<TDhzyAqcsDao, TDhzyAqcsEntity> implements TDhzyAqcsService {

    private final TDhzyAqcsDao tDhzyAqcsDao;

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDhzyAqcsDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TDhzyAqcsVO> queryPage(Page<TDhzyAqcsDTO> page, TDhzyAqcsDTO tDhzyAqcsDTO) {
        return this.tDhzyAqcsDao.queryList(page, tDhzyAqcsDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tDhzyAqcsDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TDhzyAqcsVO> queryList(TDhzyAqcsDTO tDhzyAqcsDTO) {
        return this.tDhzyAqcsDao.queryList(tDhzyAqcsDTO);
    }
}
