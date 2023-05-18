package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TLsydzyAqcsDao;
import com.lyc.wwyt.entity.TLsydzyAqcsEntity;
import com.lyc.wwyt.dto.TLsydzyAqcsDTO;
import com.lyc.wwyt.vo.TLsydzyAqcsVO;
import com.lyc.wwyt.service.TLsydzyAqcsService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 临时用电安全措施表(t_lsydzy_aqcs)表服务实现类
 *
 * @author lhh
 * @since 2023-05-18 15:54:56
 */
@Service("tLsydzyAqcsService")
@RequiredArgsConstructor
public class TLsydzyAqcsServiceImpl extends ServiceImpl<TLsydzyAqcsDao, TLsydzyAqcsEntity> implements TLsydzyAqcsService {

    private final TLsydzyAqcsDao tLsydzyAqcsDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TLsydzyAqcsVO> selectList() {
        return this.tLsydzyAqcsDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tLsydzyAqcsDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TLsydzyAqcsVO> selectPage(Page<TLsydzyAqcsDTO> page, TLsydzyAqcsDTO tLsydzyAqcsDTO) {
        return this.tLsydzyAqcsDao.selectList(page, tLsydzyAqcsDTO);
    }
}
