package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TSxkjzyQtfxDao;
import com.lyc.wwyt.dto.TSxkjzyQtfxDTO;
import com.lyc.wwyt.entity.TSxkjzyQtfxEntity;
import com.lyc.wwyt.service.TSxkjzyQtfxService;
import com.lyc.wwyt.vo.TSxkjzyQtfxVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 受限空间作业气体分析数据表(t_sxkjzy_qtfx)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:22:38
 */
@Service("tSxkjzyQtfxService")
@RequiredArgsConstructor
public class TSxkjzyQtfxServiceImpl extends ServiceImpl<TSxkjzyQtfxDao, TSxkjzyQtfxEntity> implements TSxkjzyQtfxService {

    private final TSxkjzyQtfxDao tSxkjzyQtfxDao;

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tSxkjzyQtfxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TSxkjzyQtfxVO> queryPage(Page<TSxkjzyQtfxDTO> page, TSxkjzyQtfxDTO tSxkjzyQtfxDTO) {
        return this.tSxkjzyQtfxDao.queryList(page, tSxkjzyQtfxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tSxkjzyQtfxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TSxkjzyQtfxVO> queryList(TSxkjzyQtfxDTO tSxkjzyQtfxDTO) {
        return this.tSxkjzyQtfxDao.queryList(tSxkjzyQtfxDTO);
    }
}
