package com.lyc.wwyt.controller;

import cn.allbs.excel.annotation.ExportExcel;
import cn.allbs.excel.annotation.Sheet;
import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.excel.CustomHead;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.dto.TYjylpjxxDTO;
import com.lyc.wwyt.entity.TYjylpjxxEntity;
import com.lyc.wwyt.service.CommonService;
import com.lyc.wwyt.service.TYjylpjxxService;
import com.lyc.wwyt.utils.NameUtils;
import com.lyc.wwyt.vo.TYjylpjxxVO;
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
 * 应急演练评价表（t_yjylpjxx）(t_yjylpjxx)表控制层
 *
 * @author chenqi
 * @since 2023-05-22 14:50:43
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_yjylpjxx")
@Tag(name = "应急演练评价表（t_yjylpjxx）", description = "应急演练评价表（t_yjylpjxx） 管理")
@OpenAPIDefinition(info = @Info(title = "应急演练评价表（t_yjylpjxx） Api", version = "v1", description = "应急演练评价表（t_yjylpjxx） 管理"))
public class TYjylpjxxController {

    /**
     * 服务对象
     */
    private final TYjylpjxxService tYjylpjxxService;

    /**
     * 通用数据查询
     */
    private final CommonService commonService;

    /**
     * 应急演练评价表（t_yjylpjxx）新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "应急演练评价表（t_yjylpjxx）数据新增或修改", summary = "多条应急演练评价表（t_yjylpjxx）数据新增或修改", tags = {"数据保存"})
    @SysLog("应急演练评价表（t_yjylpjxx）数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TYjylpjxxDTO> list) {
        List<TYjylpjxxEntity> entityList = new ArrayList<>(list);
        this.tYjylpjxxService.saveOrUpdateBatch(entityList);
    }

    /**
     * 查询当前账户下所有应急演练评价表（t_yjylpjxx）信息
     *
     * @return List<TYjylpjxxEntity> 当前账户下所有应急演练评价表（t_yjylpjxx）信息
     */
    @Operation(description = "查询应急演练评价表（t_yjylpjxx）信息表数据", summary = "查询应急演练评价表（t_yjylpjxx）信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    @ExportExcel(name = "应急演练评价表（t_yjylpjxx）", sheets = @Sheet(sheetName = "t_yjylpjxx"), headGenerator = CustomHead.class)
    public List<TYjylpjxxVO> selectAll(@ParameterObject TYjylpjxxDTO tYjylpjxxDTO) {
        return this.tYjylpjxxService.queryList(tYjylpjxxDTO);
    }

    /**
     * 分页查询当前账户下所有应急演练评价表（t_yjylpjxx）信息
     *
     * @return List<TYjylpjxxDTO> 分页当前账户下所有应急演练评价表（t_yjylpjxx）信息
     */
    @Operation(description = "分页应急演练评价表（t_yjylpjxx）信息表数据", summary = "分页查询应急演练评价表（t_yjylpjxx）信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TYjylpjxxVO> selectPage(@ParameterObject Page<TYjylpjxxDTO> page, @ParameterObject TYjylpjxxDTO tYjylpjxxDTO) {
        return this.tYjylpjxxService.queryPage(page, tYjylpjxxDTO);
    }

    /**
     * 查询应急演练评价表（t_yjylpjxx）的所有字段信息
     *
     * @return 所有字段信息
     */
    @GetMapping("heads")
    @Hidden
    public List<TableInfoVO> heads() {
        // 查询所有列名
        List<TableInfoVO> queryInfos = this.commonService.queryTableHeaders("t_yjylpjxx");
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
