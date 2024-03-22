package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TDzzyAqcsDao;
import com.lyc.wwyt.dto.TDzzyAqcsDTO;
import com.lyc.wwyt.entity.TDzzyAqcsEntity;
import com.lyc.wwyt.service.TDzzyAqcsService;
import com.lyc.wwyt.vo.TDzzyAqcsVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 吊装作业安全措施表(t_dzzy_aqcs)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:16:24
 */
@Service("tDzzyAqcsService")
@RequiredArgsConstructor
public class TDzzyAqcsServiceImpl extends ServiceImpl<TDzzyAqcsDao, TDzzyAqcsEntity> implements TDzzyAqcsService {

    private final TDzzyAqcsDao tDzzyAqcsDao;

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDzzyAqcsDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TDzzyAqcsVO> queryPage(Page<TDzzyAqcsDTO> page, TDzzyAqcsDTO tDzzyAqcsDTO) {
        return this.tDzzyAqcsDao.queryList(page, tDzzyAqcsDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tDzzyAqcsDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TDzzyAqcsVO> queryList(TDzzyAqcsDTO tDzzyAqcsDTO) {
        return this.tDzzyAqcsDao.queryList(tDzzyAqcsDTO);
    }
}
