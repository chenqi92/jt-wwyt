package com.lyc.wwyt.controller;

import cn.allbs.excel.annotation.ExportExcel;
import cn.allbs.excel.annotation.Sheet;
import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.entity.TYhpcrwxxEntity;
import com.lyc.wwyt.service.TYhpcrwxxService;
import com.lyc.wwyt.service.CommonService;
import com.lyc.wwyt.dto.TYhpcrwxxDTO;
import com.lyc.wwyt.vo.TYhpcrwxxVO;
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
 * 隐患排查任务信息表(t_yhpcrwxx)表控制层
 *
 * @author chenqi
 * @since 2023-05-19 14:57:26
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_yhpcrwxx")
@Tag(name = "隐患排查任务信息表", description = "隐患排查任务信息表 管理")
@OpenAPIDefinition(info = @Info(title = "隐患排查任务信息表 Api", version = "v1", description = "隐患排查任务信息表 管理"))
public class TYhpcrwxxController {

    /**
     * 服务对象
     */
    private final TYhpcrwxxService tYhpcrwxxService;

    /**
     * 通用数据查询
     */
    private final CommonService commonService;

    /**
     * 隐患排查任务信息表新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "隐患排查任务信息表数据新增或修改", summary = "多条隐患排查任务信息表数据新增或修改", tags = {"数据保存"})
    @SysLog("隐患排查任务信息表数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TYhpcrwxxDTO> list) {
        List<TYhpcrwxxEntity> entityList = new ArrayList<>(list);
        this.tYhpcrwxxService.saveOrUpdateBatch(entityList);
    }

    /**
     * 查询当前账户下所有隐患排查任务信息表信息
     *
     * @return List<TYhpcrwxxEntity> 当前账户下所有隐患排查任务信息表信息
     */
    @Operation(description = "查询隐患排查任务信息表信息表数据", summary = "查询隐患排查任务信息表信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    @ExportExcel(name = "隐患排查任务信息表", sheets = @Sheet(sheetName = "t_yhpcrwxx"))
    public List<TYhpcrwxxVO> selectAll(@ParameterObject TYhpcrwxxDTO tYhpcrwxxDTO) {
        return this.tYhpcrwxxService.queryList(tYhpcrwxxDTO);
    }

    /**
     * 分页查询当前账户下所有隐患排查任务信息表信息
     *
     * @return List<TYhpcrwxxDTO> 分页当前账户下所有隐患排查任务信息表信息
     */
    @Operation(description = "分页隐患排查任务信息表信息表数据", summary = "分页查询隐患排查任务信息表信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TYhpcrwxxVO> selectPage(@ParameterObject Page<TYhpcrwxxDTO> page, @ParameterObject TYhpcrwxxDTO tYhpcrwxxDTO) {
        return this.tYhpcrwxxService.queryPage(page, tYhpcrwxxDTO);
    }

    /**
     * 查询隐患排查任务信息表的所有字段信息
     *
     * @return 所有字段信息
     */
    @GetMapping("heads")
    @Hidden
    public List<TableInfoVO> heads() {
        // 查询所有列名
        List<TableInfoVO> queryInfos = this.commonService.queryTableHeaders("t_yhpcrwxx");
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
