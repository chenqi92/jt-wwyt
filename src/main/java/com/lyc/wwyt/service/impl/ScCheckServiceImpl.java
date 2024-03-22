package com.lyc.wwyt.service.impl;

import cn.allbs.common.utils.StringUtil;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.lang.UUID;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.RandomUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.CmUnitDao;
import com.lyc.wwyt.dao.ScCheckDao;
import com.lyc.wwyt.dto.ScCheckDTO;
import com.lyc.wwyt.entity.CmUnitEntity;
import com.lyc.wwyt.entity.ScCheckEntity;
import com.lyc.wwyt.entity.TYhzlxxEntity;
import com.lyc.wwyt.service.ScCheckService;
import com.lyc.wwyt.vo.ScCheckVO;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 安全_安全风险、隐患管理(sc_check)表服务实现类
 *
 * @author chenqi
 * @since 2023-06-01 17:50:57
 */
@Service("scCheckService")
@RequiredArgsConstructor
public class ScCheckServiceImpl extends ServiceImpl<ScCheckDao, ScCheckEntity> implements ScCheckService {

    private final ScCheckDao scCheckDao;

    private final CmUnitDao cmUnitDao;

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param scCheckDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<ScCheckVO> queryPage(Page<ScCheckDTO> page, ScCheckDTO scCheckDTO) {
        return this.scCheckDao.queryList(page, scCheckDTO);
    }

    /**
     * 查询所有数据
     *
     * @param scCheckDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<ScCheckVO> queryList(ScCheckDTO scCheckDTO) {
        return this.scCheckDao.queryList(scCheckDTO);
    }

    @Async
    @Override
    public void saveOrUpdateCheckInfo(List<TYhzlxxEntity> entityList) {
        // 查询所有企业id
        List<CmUnitEntity> cmUnitEntities = cmUnitDao.selectList(Wrappers.query());
        // 根据社会统一信用代码转为map
        Map<String, Long> socialMap = cmUnitEntities.stream().filter(a -> StringUtil.isNotEmpty(a.getSocialCreditCode())).collect(Collectors.toMap(CmUnitEntity::getSocialCreditCode, CmUnitEntity::getUnitId, (k1, k2) -> k2));
        List<ScCheckEntity> list = new ArrayList<>();
        entityList.forEach(a -> {
            if (socialMap.containsKey(a.getTyshxydm())) {
                ScCheckEntity check = new ScCheckEntity(a);
                check.setUnitId(socialMap.get(a.getTyshxydm()));
                check.setCheckMethod(1);
                check.setUnifiedCode(IdUtil.simpleUUID());
                check.setDelFlg(0);
                check.setCreateId(1L);
                check.setCreateTime(LocalDateTime.now());
                check.setUpdateId(1L);
                check.setUpdateTime(LocalDateTime.now());
                list.add(check);
            }
        });
        if (CollUtil.isNotEmpty(list)) {
            scCheckDao.saveOrUpdateCheck(list);
        }
    }
}
