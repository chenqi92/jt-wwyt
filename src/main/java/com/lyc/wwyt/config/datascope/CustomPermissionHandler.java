package com.lyc.wwyt.config.datascope;

import cn.allbs.common.constant.StringPool;
import cn.allbs.mybatis.datascope.DataPmsHandler;
import cn.allbs.mybatis.datascope.ScopeField;
import com.baomidou.mybatisplus.core.metadata.TableFieldInfo;
import com.baomidou.mybatisplus.core.metadata.TableInfo;
import com.baomidou.mybatisplus.core.metadata.TableInfoHelper;
import com.lyc.wwyt.constants.SecurityConstant;
import com.lyc.wwyt.constants.TableConstant;
import com.lyc.wwyt.utils.SecurityUtil;
import lombok.extern.slf4j.Slf4j;
import net.sf.jsqlparser.expression.Alias;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.StringValue;
import net.sf.jsqlparser.expression.operators.conditional.AndExpression;
import net.sf.jsqlparser.expression.operators.relational.EqualsTo;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.insert.Insert;
import net.sf.jsqlparser.statement.update.Update;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * 类 CustomPermissionHandler
 *
 * @author ChenQi
 * @date 2023/5/12
 */
@Slf4j
@Component
public class CustomPermissionHandler implements DataPmsHandler {

    private final static String DEFAULT_FILTER_FIELD = "create_by";

    /**
     * 获取数据权限 SQL 片段
     *
     * @param where             待执行 SQL Where 条件表达式
     * @param mappedStatementId Mybatis MappedStatement Id 根据该参数可以判断具体执行方法
     * @return JSqlParser 条件表达式
     */
    @Override
    public Expression getSqlSegment(final Table table, Expression where, String mappedStatementId) {
        if (TableConstant.CM_UNIT.equals(table.getName())) {
            return where;
        }
        // 在有权限的情况下查询用户所关联的企业列表
        String userName = SecurityUtil.getUsername();
        // 如果非权限用户则不往下执行，执行原sql
        if (userName == null || SecurityConstant.SUPER_USER.equals(userName)) {
            return where;
        }
        TableInfo tableInfo = TableInfoHelper.getTableInfo(table.getName());
        if (tableInfo == null) {
            return where;
        }
        String fieldName = tableInfo.getFieldList().stream().filter(a -> a.getField().getAnnotation(ScopeField.class) != null).map(a -> a.getField().getAnnotation(ScopeField.class).value()).findFirst().orElse(DEFAULT_FILTER_FIELD);
        Alias fromItemAlias = table.getAlias();
        String finalFieldName = Optional.ofNullable(fromItemAlias).map(a -> a.getName() + StringPool.DOT + fieldName).orElse(fieldName);

        // 设置where
        EqualsTo equalsTo = new EqualsTo();
        equalsTo.setLeftExpression(new Column(finalFieldName));
        equalsTo.setRightExpression(new StringValue(userName));
        return where == null ? equalsTo : new AndExpression(where, equalsTo);
    }

    @Override
    public void updateParameter(Update updateStmt, MappedStatement mappedStatement, BoundSql boundSql) {
        TableInfo tableInfo = TableInfoHelper.getTableInfo(updateStmt.getTable().getName());
        parameterHandler(tableInfo.getFieldList(), boundSql);
    }

    @Override
    public void insertParameter(Insert insertStmt, BoundSql boundSql) {
        TableInfo tableInfo = TableInfoHelper.getTableInfo(insertStmt.getTable().getName());
        parameterHandler(tableInfo.getFieldList(), boundSql);
    }

    private void parameterHandler(List<TableFieldInfo> fieldList, BoundSql boundSql) {
        // 插入权限过滤暂不操作
    }
}
