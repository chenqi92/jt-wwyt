package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TShutdownExamDao;
import com.lyc.wwyt.dto.TShutdownExamDTO;
import com.lyc.wwyt.entity.TShutdownExamEntity;
import com.lyc.wwyt.service.TShutdownExamService;
import com.lyc.wwyt.vo.TShutdownExamVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 开停车大检修(t_shutdown_exam)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-23 11:07:25
 */
@Service("tShutdownExamService")
@RequiredArgsConstructor
public class TShutdownExamServiceImpl extends ServiceImpl<TShutdownExamDao, TShutdownExamEntity> implements TShutdownExamService {

    private final TShutdownExamDao tShutdownExamDao;

    /**
     * 分页查询所有数据
     *
     * @param page             分页参数
     * @param tShutdownExamDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TShutdownExamVO> queryPage(Page<TShutdownExamDTO> page, TShutdownExamDTO tShutdownExamDTO) {
        return this.tShutdownExamDao.queryList(page, tShutdownExamDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tShutdownExamDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TShutdownExamVO> queryList(TShutdownExamDTO tShutdownExamDTO) {
        return this.tShutdownExamDao.queryList(tShutdownExamDTO);
    }
}
