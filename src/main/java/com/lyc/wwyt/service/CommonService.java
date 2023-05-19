package com.lyc.wwyt.service;

import com.lyc.wwyt.vo.TableInfoVO;

import java.util.List;

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
}
