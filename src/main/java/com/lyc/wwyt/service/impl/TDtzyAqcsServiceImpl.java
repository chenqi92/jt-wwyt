package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TDtzyAqcsDao;
import com.lyc.wwyt.dto.TDtzyAqcsDTO;
import com.lyc.wwyt.entity.TDtzyAqcsEntity;
import com.lyc.wwyt.service.TDtzyAqcsService;
import com.lyc.wwyt.vo.TDtzyAqcsVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 动土作业安全措施表(t_dtzy_aqcs)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:13:42
 */
@Service("tDtzyAqcsService")
@RequiredArgsConstructor
public class TDtzyAqcsServiceImpl extends ServiceImpl<TDtzyAqcsDao, TDtzyAqcsEntity> implements TDtzyAqcsService {

    private final TDtzyAqcsDao tDtzyAqcsDao;

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDtzyAqcsDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TDtzyAqcsVO> queryPage(Page<TDtzyAqcsDTO> page, TDtzyAqcsDTO tDtzyAqcsDTO) {
        return this.tDtzyAqcsDao.queryList(page, tDtzyAqcsDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tDtzyAqcsDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TDtzyAqcsVO> queryList(TDtzyAqcsDTO tDtzyAqcsDTO) {
        return this.tDtzyAqcsDao.queryList(tDtzyAqcsDTO);
    }
}
