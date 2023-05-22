package com.lyc.wwyt.controller;

import cn.allbs.excel.annotation.ExportExcel;
import cn.allbs.excel.annotation.Sheet;
import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.excel.CustomHead;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.entity.TJcbwhxxEntity;
import com.lyc.wwyt.service.TJcbwhxxService;
import com.lyc.wwyt.service.CommonService;
import com.lyc.wwyt.dto.TJcbwhxxDTO;
import com.lyc.wwyt.vo.TJcbwhxxVO;
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
 * 安全检查表维护信息表结构(t_jcbwhxx)表控制层
 *
 * @author chenqi
 * @since 2023-05-22 14:50:41
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_jcbwhxx")
@Tag(name = "安全检查表维护信息表结构", description = "安全检查表维护信息表结构 管理")
@OpenAPIDefinition(info = @Info(title = "安全检查表维护信息表结构 Api", version = "v1", description = "安全检查表维护信息表结构 管理"))
public class TJcbwhxxController {

    /**
     * 服务对象
     */
    private final TJcbwhxxService tJcbwhxxService;

    /**
     * 通用数据查询
     */
    private final CommonService commonService;

    /**
     * 安全检查表维护信息表结构新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "安全检查表维护信息表结构数据新增或修改", summary = "多条安全检查表维护信息表结构数据新增或修改", tags = {"数据保存"})
    @SysLog("安全检查表维护信息表结构数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TJcbwhxxDTO> list) {
        List<TJcbwhxxEntity> entityList = new ArrayList<>(list);
        this.tJcbwhxxService.saveOrUpdateBatch(entityList);
    }

    /**
     * 查询当前账户下所有安全检查表维护信息表结构信息
     *
     * @return List<TJcbwhxxEntity> 当前账户下所有安全检查表维护信息表结构信息
     */
    @Operation(description = "查询安全检查表维护信息表结构信息表数据", summary = "查询安全检查表维护信息表结构信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    @ExportExcel(name = "安全检查表维护信息表结构", sheets = @Sheet(sheetName = "t_jcbwhxx"), headGenerator = CustomHead.class)
    public List<TJcbwhxxVO> selectAll(@ParameterObject TJcbwhxxDTO tJcbwhxxDTO) {
        return this.tJcbwhxxService.queryList(tJcbwhxxDTO);
    }

    /**
     * 分页查询当前账户下所有安全检查表维护信息表结构信息
     *
     * @return List<TJcbwhxxDTO> 分页当前账户下所有安全检查表维护信息表结构信息
     */
    @Operation(description = "分页安全检查表维护信息表结构信息表数据", summary = "分页查询安全检查表维护信息表结构信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TJcbwhxxVO> selectPage(@ParameterObject Page<TJcbwhxxDTO> page, @ParameterObject TJcbwhxxDTO tJcbwhxxDTO) {
        return this.tJcbwhxxService.queryPage(page, tJcbwhxxDTO);
    }

    /**
     * 查询安全检查表维护信息表结构的所有字段信息
     *
     * @return 所有字段信息
     */
    @GetMapping("heads")
    @Hidden
    public List<TableInfoVO> heads() {
        // 查询所有列名
        List<TableInfoVO> queryInfos = this.commonService.queryTableHeaders("t_jcbwhxx");
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
