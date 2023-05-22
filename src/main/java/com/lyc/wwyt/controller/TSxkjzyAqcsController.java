package com.lyc.wwyt.controller;

import cn.allbs.excel.annotation.ExportExcel;
import cn.allbs.excel.annotation.Sheet;
import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.excel.CustomHead;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.entity.TSxkjzyAqcsEntity;
import com.lyc.wwyt.service.TSxkjzyAqcsService;
import com.lyc.wwyt.service.CommonService;
import com.lyc.wwyt.dto.TSxkjzyAqcsDTO;
import com.lyc.wwyt.vo.TSxkjzyAqcsVO;
import com.lyc.wwyt.vo.TableInfoVO;
import com.lyc.wwyt.utils.NameUtils;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 受限空间作业安全措施表(t_sxkjzy_aqcs)表控制层
 *
 * @author lhh
 * @since 2023-05-22 17:49:12
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_sxkjzy_aqcs")
@Tag(name = "受限空间作业安全措施表", description = "受限空间作业安全措施表 管理")
@OpenAPIDefinition(info = @Info(title = "受限空间作业安全措施表 Api", version = "v1", description = "受限空间作业安全措施表 管理"))
public class TSxkjzyAqcsController {

    /**
     * 服务对象
     */
    private final TSxkjzyAqcsService tSxkjzyAqcsService;

    /**
     * 通用数据查询
     */
    private final CommonService commonService;

    /**
     * 受限空间作业安全措施表新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "受限空间作业安全措施表数据新增或修改", summary = "多条受限空间作业安全措施表数据新增或修改", tags = {"数据保存"})
    @SysLog("受限空间作业安全措施表数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TSxkjzyAqcsDTO> list) {
        List<TSxkjzyAqcsEntity> entityList = new ArrayList<>(list);
        this.tSxkjzyAqcsService.saveOrUpdateBatch(entityList);
    }

    /**
     * 查询当前账户下所有受限空间作业安全措施表信息
     *
     * @return List<TSxkjzyAqcsEntity> 当前账户下所有受限空间作业安全措施表信息
     */
    @Operation(description = "查询受限空间作业安全措施表信息表数据", summary = "查询受限空间作业安全措施表信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    @ExportExcel(name = "受限空间作业安全措施表", sheets = @Sheet(sheetName = "t_sxkjzy_aqcs"), headGenerator = CustomHead.class)
    public List<TSxkjzyAqcsVO> selectAll(@ParameterObject TSxkjzyAqcsDTO tSxkjzyAqcsDTO) {
        return this.tSxkjzyAqcsService.queryList(tSxkjzyAqcsDTO);
    }

    /**
     * 分页查询当前账户下所有受限空间作业安全措施表信息
     *
     * @return List<TSxkjzyAqcsDTO> 分页当前账户下所有受限空间作业安全措施表信息
     */
    @Operation(description = "分页受限空间作业安全措施表信息表数据", summary = "分页查询受限空间作业安全措施表信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TSxkjzyAqcsVO> selectPage(@ParameterObject Page<TSxkjzyAqcsDTO> page, @ParameterObject TSxkjzyAqcsDTO tSxkjzyAqcsDTO) {
        return this.tSxkjzyAqcsService.queryPage(page, tSxkjzyAqcsDTO);
    }

    /**
     * 查询受限空间作业安全措施表的所有字段信息
     *
     * @return 所有字段信息
     */
    @GetMapping("heads")
    @Hidden
    public List<TableInfoVO> heads() {
        // 查询所有列名
        List<TableInfoVO> queryInfos = this.commonService.queryTableHeaders("t_sxkjzy_aqcs");
        List<TableInfoVO> tableInfoVOS = new LinkedList<>();
        queryInfos.forEach(a -> {
            if (!"delete_mark".equals(a.getName())) {
                TableInfoVO table = new TableInfoVO();
                table.setCode(NameUtils.getClassName(a.getName()));
                table.setName(a.getName());
                table.setComment(a.getComment());
                tableInfoVOS.add(table);
            }
        });
        return tableInfoVOS;
    }

}
