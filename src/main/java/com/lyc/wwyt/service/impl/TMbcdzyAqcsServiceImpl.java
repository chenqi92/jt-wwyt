package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TMbcdzyAqcsDao;
import com.lyc.wwyt.dto.TMbcdzyAqcsDTO;
import com.lyc.wwyt.entity.TMbcdzyAqcsEntity;
import com.lyc.wwyt.service.TMbcdzyAqcsService;
import com.lyc.wwyt.vo.TMbcdzyAqcsVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 盲板抽堵安全措施表(t_mbcdzy_aqcs)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:22:31
 */
@Service("tMbcdzyAqcsService")
@RequiredArgsConstructor
public class TMbcdzyAqcsServiceImpl extends ServiceImpl<TMbcdzyAqcsDao, TMbcdzyAqcsEntity> implements TMbcdzyAqcsService {

    private final TMbcdzyAqcsDao tMbcdzyAqcsDao;

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tMbcdzyAqcsDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TMbcdzyAqcsVO> queryPage(Page<TMbcdzyAqcsDTO> page, TMbcdzyAqcsDTO tMbcdzyAqcsDTO) {
        return this.tMbcdzyAqcsDao.queryList(page, tMbcdzyAqcsDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tMbcdzyAqcsDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TMbcdzyAqcsVO> queryList(TMbcdzyAqcsDTO tMbcdzyAqcsDTO) {
        return this.tMbcdzyAqcsDao.queryList(tMbcdzyAqcsDTO);
    }
}
