package com.lyc.wwyt.service;

import com.lyc.wwyt.entity.old.CmUnitEntity;
import com.lyc.wwyt.vo.TableInfoVO;

import java.util.List;
import java.util.Map;

/**
 * 接口 CommonService
 * 通用查询接口
 *
 * @author ChenQi
 * @date 2023/5/19
 */
public interface CommonService {

    /**
     * 查询指定表中表所有的列名
     *
     * @return 查询指定表中所有的列名
     */
    List<TableInfoVO> queryTableHeaders(String tableName);

    /**
     * 查询对应unitId
     *
     * @return 查询对应unitId
     */
    CmUnitEntity queryUnitId(String code);

    void saveOrUpdateData(List<List<Object>> list, List<String> columns, String tableName);
}
