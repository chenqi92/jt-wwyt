package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TGczyAqcsDao;
import com.lyc.wwyt.entity.TGczyAqcsEntity;
import com.lyc.wwyt.dto.TGczyAqcsDTO;
import com.lyc.wwyt.vo.TGczyAqcsVO;
import com.lyc.wwyt.service.TGczyAqcsService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 高处作业信息安全措施表(t_gczy_aqcs)表服务实现类
 *
 * @author lhh
 * @since 2023-05-18 15:54:50
 */
@Service("tGczyAqcsService")
@RequiredArgsConstructor
public class TGczyAqcsServiceImpl extends ServiceImpl<TGczyAqcsDao, TGczyAqcsEntity> implements TGczyAqcsService {

    private final TGczyAqcsDao tGczyAqcsDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TGczyAqcsVO> selectList() {
        return this.tGczyAqcsDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tGczyAqcsDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TGczyAqcsVO> selectPage(Page<TGczyAqcsDTO> page, TGczyAqcsDTO tGczyAqcsDTO) {
        return this.tGczyAqcsDao.selectList(page, tGczyAqcsDTO);
    }
}
