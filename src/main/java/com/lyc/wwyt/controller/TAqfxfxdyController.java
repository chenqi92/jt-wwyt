package com.lyc.wwyt.controller;

import cn.allbs.excel.annotation.ExportExcel;
import cn.allbs.excel.annotation.Sheet;
import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.entity.TAqfxfxdyEntity;
import com.lyc.wwyt.service.TAqfxfxdyService;
import com.lyc.wwyt.service.CommonService;
import com.lyc.wwyt.dto.TAqfxfxdyDTO;
import com.lyc.wwyt.vo.TAqfxfxdyVO;
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
 * 安全风险分析单元表(t_aqfxfxdy)表控制层
 *
 * @author chenqi
 * @since 2023-05-19 14:57:24
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_aqfxfxdy")
@Tag(name = "安全风险分析单元表", description = "安全风险分析单元表 管理")
@OpenAPIDefinition(info = @Info(title = "安全风险分析单元表 Api", version = "v1", description = "安全风险分析单元表 管理"))
public class TAqfxfxdyController {

    /**
     * 服务对象
     */
    private final TAqfxfxdyService tAqfxfxdyService;

    /**
     * 通用数据查询
     */
    private final CommonService commonService;

    /**
     * 安全风险分析单元表新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "安全风险分析单元表数据新增或修改", summary = "多条安全风险分析单元表数据新增或修改", tags = {"数据保存"})
    @SysLog("安全风险分析单元表数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TAqfxfxdyDTO> list) {
        List<TAqfxfxdyEntity> entityList = new ArrayList<>(list);
        this.tAqfxfxdyService.saveOrUpdateBatch(entityList);
    }

    /**
     * 查询当前账户下所有安全风险分析单元表信息
     *
     * @return List<TAqfxfxdyEntity> 当前账户下所有安全风险分析单元表信息
     */
    @Operation(description = "查询安全风险分析单元表信息表数据", summary = "查询安全风险分析单元表信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    @ExportExcel(name = "安全风险分析单元表", sheets = @Sheet(sheetName = "t_aqfxfxdy"))
    public List<TAqfxfxdyVO> selectAll(@ParameterObject TAqfxfxdyDTO tAqfxfxdyDTO) {
        return this.tAqfxfxdyService.queryList(tAqfxfxdyDTO);
    }

    /**
     * 分页查询当前账户下所有安全风险分析单元表信息
     *
     * @return List<TAqfxfxdyDTO> 分页当前账户下所有安全风险分析单元表信息
     */
    @Operation(description = "分页安全风险分析单元表信息表数据", summary = "分页查询安全风险分析单元表信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TAqfxfxdyVO> selectPage(@ParameterObject Page<TAqfxfxdyDTO> page, @ParameterObject TAqfxfxdyDTO tAqfxfxdyDTO) {
        return this.tAqfxfxdyService.queryPage(page, tAqfxfxdyDTO);
    }

    /**
     * 查询安全风险分析单元表的所有字段信息
     *
     * @return 所有字段信息
     */
    @GetMapping("heads")
    @Hidden
    public List<TableInfoVO> heads() {
        // 查询所有列名
        List<TableInfoVO> queryInfos = this.commonService.queryTableHeaders("t_aqfxfxdy");
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
