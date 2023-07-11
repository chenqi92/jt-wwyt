package com.lyc.wwyt.dao;

import com.lyc.wwyt.entity.old.CmUnitEntity;
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

    /**
     * 查询对应unitId
     *
     * @return 查询对应unitId
     */
    List<CmUnitEntity> queryUnitId(@Param("code") String code);

    /**
     * 保存数据
     *
     * @param list      数据信息
     * @param columns   所有代保存列
     * @param tableName 表名
     */
    void saveOrUpdateData(@Param("list") List<List<Object>> list, @Param("columns") List<String> columns, @Param("tableName") String tableName);
}
