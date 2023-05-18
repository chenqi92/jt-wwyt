package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TDtzyAqcsDao;
import com.lyc.wwyt.entity.TDtzyAqcsEntity;
import com.lyc.wwyt.dto.TDtzyAqcsDTO;
import com.lyc.wwyt.vo.TDtzyAqcsVO;
import com.lyc.wwyt.service.TDtzyAqcsService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 动土作业安全措施表(t_dtzy_aqcs)表服务实现类
 *
 * @author lhh
 * @since 2023-05-18 15:54:35
 */
@Service("tDtzyAqcsService")
@RequiredArgsConstructor
public class TDtzyAqcsServiceImpl extends ServiceImpl<TDtzyAqcsDao, TDtzyAqcsEntity> implements TDtzyAqcsService {

    private final TDtzyAqcsDao tDtzyAqcsDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TDtzyAqcsVO> selectList() {
        return this.tDtzyAqcsDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDtzyAqcsDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TDtzyAqcsVO> selectPage(Page<TDtzyAqcsDTO> page, TDtzyAqcsDTO tDtzyAqcsDTO) {
        return this.tDtzyAqcsDao.selectList(page, tDtzyAqcsDTO);
    }
}
