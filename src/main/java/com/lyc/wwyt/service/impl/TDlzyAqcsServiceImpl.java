package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TDlzyAqcsDao;
import com.lyc.wwyt.dto.TDlzyAqcsDTO;
import com.lyc.wwyt.entity.TDlzyAqcsEntity;
import com.lyc.wwyt.service.TDlzyAqcsService;
import com.lyc.wwyt.vo.TDlzyAqcsVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 断路作业安全措施表(t_dlzy_aqcs)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:13:41
 */
@Service("tDlzyAqcsService")
@RequiredArgsConstructor
public class TDlzyAqcsServiceImpl extends ServiceImpl<TDlzyAqcsDao, TDlzyAqcsEntity> implements TDlzyAqcsService {

    private final TDlzyAqcsDao tDlzyAqcsDao;

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDlzyAqcsDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TDlzyAqcsVO> queryPage(Page<TDlzyAqcsDTO> page, TDlzyAqcsDTO tDlzyAqcsDTO) {
        return this.tDlzyAqcsDao.queryList(page, tDlzyAqcsDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tDlzyAqcsDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TDlzyAqcsVO> queryList(TDlzyAqcsDTO tDlzyAqcsDTO) {
        return this.tDlzyAqcsDao.queryList(tDlzyAqcsDTO);
    }
}
