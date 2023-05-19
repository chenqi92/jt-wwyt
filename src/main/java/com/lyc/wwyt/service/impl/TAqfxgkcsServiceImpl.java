package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TAqfxgkcsDao;
import com.lyc.wwyt.entity.TAqfxgkcsEntity;
import com.lyc.wwyt.dto.TAqfxgkcsDTO;
import com.lyc.wwyt.vo.TAqfxgkcsVO;
import com.lyc.wwyt.service.TAqfxgkcsService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 安全风险管控措施表结构(t_aqfxgkcs)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-19 14:56:47
 */
@Service("tAqfxgkcsService")
@RequiredArgsConstructor
public class TAqfxgkcsServiceImpl extends ServiceImpl<TAqfxgkcsDao, TAqfxgkcsEntity> implements TAqfxgkcsService {

    private final TAqfxgkcsDao tAqfxgkcsDao;

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tAqfxgkcsDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TAqfxgkcsVO> queryPage(Page<TAqfxgkcsDTO> page, TAqfxgkcsDTO tAqfxgkcsDTO) {
        return this.tAqfxgkcsDao.queryList(page, tAqfxgkcsDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tAqfxgkcsDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TAqfxgkcsVO> queryList(TAqfxgkcsDTO tAqfxgkcsDTO) {
        return this.tAqfxgkcsDao.queryList(tAqfxgkcsDTO);
    }
}
