package com.lyc.wwyt.dao;

import com.lyc.wwyt.vo.TableInfoVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 通用数据访问
 *
 * @author chenqi
 * @since 2023-05-19 14:43:24
 */
@Mapper
public interface CommonDao {

    /**
     * 查询指定表中所有的列名
     *
     * @return 安指定表所有列名信息
     */
    List<TableInfoVO> queryTableHeaders(@Param("tableName") String tableName);
}
