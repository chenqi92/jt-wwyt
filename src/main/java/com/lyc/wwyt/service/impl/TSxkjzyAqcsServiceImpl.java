package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TSxkjzyAqcsDao;
import com.lyc.wwyt.entity.TSxkjzyAqcsEntity;
import com.lyc.wwyt.dto.TSxkjzyAqcsDTO;
import com.lyc.wwyt.vo.TSxkjzyAqcsVO;
import com.lyc.wwyt.service.TSxkjzyAqcsService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 受限空间作业安全措施表(t_sxkjzy_aqcs)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:22:37
 */
@Service("tSxkjzyAqcsService")
@RequiredArgsConstructor
public class TSxkjzyAqcsServiceImpl extends ServiceImpl<TSxkjzyAqcsDao, TSxkjzyAqcsEntity> implements TSxkjzyAqcsService {

    private final TSxkjzyAqcsDao tSxkjzyAqcsDao;

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tSxkjzyAqcsDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TSxkjzyAqcsVO> queryPage(Page<TSxkjzyAqcsDTO> page, TSxkjzyAqcsDTO tSxkjzyAqcsDTO) {
        return this.tSxkjzyAqcsDao.queryList(page, tSxkjzyAqcsDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tSxkjzyAqcsDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TSxkjzyAqcsVO> queryList(TSxkjzyAqcsDTO tSxkjzyAqcsDTO) {
        return this.tSxkjzyAqcsDao.queryList(tSxkjzyAqcsDTO);
    }
}
