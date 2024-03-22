package com.lyc.wwyt.controller;

import cn.allbs.excel.annotation.ExportExcel;
import cn.allbs.excel.annotation.Sheet;
import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.excel.CustomHead;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.dto.TShutdownExamDTO;
import com.lyc.wwyt.entity.TShutdownExamEntity;
import com.lyc.wwyt.service.CommonService;
import com.lyc.wwyt.service.TShutdownExamService;
import com.lyc.wwyt.utils.NameUtils;
import com.lyc.wwyt.vo.TShutdownExamVO;
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
 * 开停车大检修(t_shutdown_exam)表控制层
 *
 * @author chenqi
 * @since 2023-05-23 11:07:25
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_shutdown_exam")
@Tag(name = "开停车大检修", description = "开停车大检修 管理")
@OpenAPIDefinition(info = @Info(title = "开停车大检修 Api", version = "v1", description = "开停车大检修 管理"))
public class TShutdownExamController {

    /**
     * 服务对象
     */
    private final TShutdownExamService tShutdownExamService;

    /**
     * 通用数据查询
     */
    private final CommonService commonService;

    /**
     * 开停车大检修新增或修改
     *
     * @param list 承包商管理信息表
     */
    @Operation(description = "开停车大检修数据新增或修改", summary = "多条开停车大检修数据新增或修改", tags = {"数据保存"})
    @SysLog("开停车大检修数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TShutdownExamDTO> list) {
        List<TShutdownExamEntity> entityList = new ArrayList<>(list);
        this.tShutdownExamService.saveOrUpdateBatch(entityList);
    }

    /**
     * 查询当前账户下所有开停车大检修信息
     *
     * @return List<TShutdownExamEntity> 当前账户下所有开停车大检修信息
     */
    @Operation(description = "查询开停车大检修信息表数据", summary = "查询开停车大检修信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    @ExportExcel(name = "开停车大检修", sheets = @Sheet(sheetName = "t_shutdown_exam"), headGenerator = CustomHead.class)
    public List<TShutdownExamVO> selectAll(@ParameterObject TShutdownExamDTO tShutdownExamDTO) {
        return this.tShutdownExamService.queryList(tShutdownExamDTO);
    }

    /**
     * 分页查询当前账户下所有开停车大检修信息
     *
     * @return List<TShutdownExamDTO> 分页当前账户下所有开停车大检修信息
     */
    @Operation(description = "分页开停车大检修信息表数据", summary = "分页查询开停车大检修信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TShutdownExamVO> selectPage(@ParameterObject Page<TShutdownExamDTO> page, @ParameterObject TShutdownExamDTO tShutdownExamDTO) {
        return this.tShutdownExamService.queryPage(page, tShutdownExamDTO);
    }

    /**
     * 查询开停车大检修的所有字段信息
     *
     * @return 所有字段信息
     */
    @GetMapping("heads")
    @Hidden
    public List<TableInfoVO> heads() {
        // 查询所有列名
        List<TableInfoVO> queryInfos = this.commonService.queryTableHeaders("t_shutdown_exam");
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
