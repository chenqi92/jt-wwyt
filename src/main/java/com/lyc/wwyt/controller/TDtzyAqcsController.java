package com.lyc.wwyt.controller;

import cn.allbs.excel.annotation.ExportExcel;
import cn.allbs.excel.annotation.Sheet;
import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.excel.CustomHead;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.dto.TDtzyAqcsDTO;
import com.lyc.wwyt.entity.TDtzyAqcsEntity;
import com.lyc.wwyt.service.CommonService;
import com.lyc.wwyt.service.TDtzyAqcsService;
import com.lyc.wwyt.utils.NameUtils;
import com.lyc.wwyt.vo.TDtzyAqcsVO;
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
 * 动土作业安全措施表(t_dtzy_aqcs)表控制层
 *
 * @author lhh
 * @since 2023-05-22 17:47:36
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_dtzy_aqcs")
@Tag(name = "动土作业安全措施表", description = "动土作业安全措施表 管理")
@OpenAPIDefinition(info = @Info(title = "动土作业安全措施表 Api", version = "v1", description = "动土作业安全措施表 管理"))
public class TDtzyAqcsController {

    /**
     * 服务对象
     */
    private final TDtzyAqcsService tDtzyAqcsService;

    /**
     * 通用数据查询
     */
    private final CommonService commonService;

    /**
     * 动土作业安全措施表新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "动土作业安全措施表数据新增或修改", summary = "多条动土作业安全措施表数据新增或修改", tags = {"数据保存"})
    @SysLog("动土作业安全措施表数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TDtzyAqcsDTO> list) {
        List<TDtzyAqcsEntity> entityList = new ArrayList<>(list);
        this.tDtzyAqcsService.saveOrUpdateBatch(entityList);
    }

    /**
     * 查询当前账户下所有动土作业安全措施表信息
     *
     * @return List<TDtzyAqcsEntity> 当前账户下所有动土作业安全措施表信息
     */
    @Operation(description = "查询动土作业安全措施表信息表数据", summary = "查询动土作业安全措施表信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    @ExportExcel(name = "动土作业安全措施表", sheets = @Sheet(sheetName = "t_dtzy_aqcs"), headGenerator = CustomHead.class)
    public List<TDtzyAqcsVO> selectAll(@ParameterObject TDtzyAqcsDTO tDtzyAqcsDTO) {
        return this.tDtzyAqcsService.queryList(tDtzyAqcsDTO);
    }

    /**
     * 分页查询当前账户下所有动土作业安全措施表信息
     *
     * @return List<TDtzyAqcsDTO> 分页当前账户下所有动土作业安全措施表信息
     */
    @Operation(description = "分页动土作业安全措施表信息表数据", summary = "分页查询动土作业安全措施表信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TDtzyAqcsVO> selectPage(@ParameterObject Page<TDtzyAqcsDTO> page, @ParameterObject TDtzyAqcsDTO tDtzyAqcsDTO) {
        return this.tDtzyAqcsService.queryPage(page, tDtzyAqcsDTO);
    }

    /**
     * 查询动土作业安全措施表的所有字段信息
     *
     * @return 所有字段信息
     */
    @GetMapping("heads")
    @Hidden
    public List<TableInfoVO> heads() {
        // 查询所有列名
        List<TableInfoVO> queryInfos = this.commonService.queryTableHeaders("t_dtzy_aqcs");
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
