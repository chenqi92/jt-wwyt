package com.lyc.wwyt.service.impl;

import com.lyc.wwyt.dao.CommonDao;
import com.lyc.wwyt.service.CommonService;
import com.lyc.wwyt.vo.TableInfoVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类 CommonServiceImpl
 *
 * @author ChenQi
 * @date 2023/5/19
 */
@Service("commonService")
@RequiredArgsConstructor
public class CommonServiceImpl implements CommonService {

    private final CommonDao commonDao;

    @Override
    public List<TableInfoVO> queryTableHeaders(String tableName) {
        return this.commonDao.queryTableHeaders(tableName);
    }
}
