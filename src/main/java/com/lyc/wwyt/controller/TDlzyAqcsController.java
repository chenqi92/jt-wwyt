package com.lyc.wwyt.controller;

import cn.allbs.excel.annotation.ExportExcel;
import cn.allbs.excel.annotation.Sheet;
import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.excel.CustomHead;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.dto.TDlzyAqcsDTO;
import com.lyc.wwyt.entity.TDlzyAqcsEntity;
import com.lyc.wwyt.service.CommonService;
import com.lyc.wwyt.service.TDlzyAqcsService;
import com.lyc.wwyt.utils.NameUtils;
import com.lyc.wwyt.vo.TDlzyAqcsVO;
import com.lyc.wwyt.vo.TableInfoVO;
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
 * 断路作业安全措施表(t_dlzy_aqcs)表控制层
 *
 * @author lhh
 * @since 2023-05-22 17:47:36
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_dlzy_aqcs")
@Tag(name = "断路作业安全措施表", description = "断路作业安全措施表 管理")
@OpenAPIDefinition(info = @Info(title = "断路作业安全措施表 Api", version = "v1", description = "断路作业安全措施表 管理"))
public class TDlzyAqcsController {

    /**
     * 服务对象
     */
    private final TDlzyAqcsService tDlzyAqcsService;

    /**
     * 通用数据查询
     */
    private final CommonService commonService;

    /**
     * 断路作业安全措施表新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "断路作业安全措施表数据新增或修改", summary = "多条断路作业安全措施表数据新增或修改", tags = {"数据保存"})
    @SysLog("断路作业安全措施表数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TDlzyAqcsDTO> list) {
        List<TDlzyAqcsEntity> entityList = new ArrayList<>(list);
        this.tDlzyAqcsService.saveOrUpdateBatch(entityList);
    }

    /**
     * 查询当前账户下所有断路作业安全措施表信息
     *
     * @return List<TDlzyAqcsEntity> 当前账户下所有断路作业安全措施表信息
     */
    @Operation(description = "查询断路作业安全措施表信息表数据", summary = "查询断路作业安全措施表信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    @ExportExcel(name = "断路作业安全措施表", sheets = @Sheet(sheetName = "t_dlzy_aqcs"), headGenerator = CustomHead.class)
    public List<TDlzyAqcsVO> selectAll(@ParameterObject TDlzyAqcsDTO tDlzyAqcsDTO) {
        return this.tDlzyAqcsService.queryList(tDlzyAqcsDTO);
    }

    /**
     * 分页查询当前账户下所有断路作业安全措施表信息
     *
     * @return List<TDlzyAqcsDTO> 分页当前账户下所有断路作业安全措施表信息
     */
    @Operation(description = "分页断路作业安全措施表信息表数据", summary = "分页查询断路作业安全措施表信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TDlzyAqcsVO> selectPage(@ParameterObject Page<TDlzyAqcsDTO> page, @ParameterObject TDlzyAqcsDTO tDlzyAqcsDTO) {
        return this.tDlzyAqcsService.queryPage(page, tDlzyAqcsDTO);
    }

    /**
     * 查询断路作业安全措施表的所有字段信息
     *
     * @return 所有字段信息
     */
    @GetMapping("heads")
    @Hidden
    public List<TableInfoVO> heads() {
        // 查询所有列名
        List<TableInfoVO> queryInfos = this.commonService.queryTableHeaders("t_dlzy_aqcs");
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
