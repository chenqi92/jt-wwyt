package com.lyc.wwyt.controller;

import cn.allbs.excel.annotation.ExportExcel;
import cn.allbs.excel.annotation.Sheet;
import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.excel.CustomHead;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.dto.TQyjcxxDTO;
import com.lyc.wwyt.entity.TQyjcxxEntity;
import com.lyc.wwyt.service.CommonService;
import com.lyc.wwyt.service.TQyjcxxService;
import com.lyc.wwyt.utils.NameUtils;
import com.lyc.wwyt.vo.TQyjcxxVO;
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
 * 企业基础信息表(t_qyjcxx)表控制层
 *
 * @author lhh
 * @since 2023-05-22 17:48:30
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_qyjcxx")
@Tag(name = "企业基础信息表", description = "企业基础信息表 管理")
@OpenAPIDefinition(info = @Info(title = "企业基础信息表 Api", version = "v1", description = "企业基础信息表 管理"))
public class TQyjcxxController {

    /**
     * 服务对象
     */
    private final TQyjcxxService tQyjcxxService;

    /**
     * 通用数据查询
     */
    private final CommonService commonService;

    /**
     * 企业基础信息表新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "企业基础信息表数据新增或修改", summary = "多条企业基础信息表数据新增或修改", tags = {"数据保存"})
    @SysLog("企业基础信息表数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TQyjcxxDTO> list) {
        List<TQyjcxxEntity> entityList = new ArrayList<>(list);
        this.tQyjcxxService.saveOrUpdateBatch(entityList);
    }

    /**
     * 查询当前账户下所有企业基础信息表信息
     *
     * @return List<TQyjcxxEntity> 当前账户下所有企业基础信息表信息
     */
    @Operation(description = "查询企业基础信息表信息表数据", summary = "查询企业基础信息表信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    @ExportExcel(name = "企业基础信息表", sheets = @Sheet(sheetName = "t_qyjcxx"), headGenerator = CustomHead.class)
    public List<TQyjcxxVO> selectAll(@ParameterObject TQyjcxxDTO tQyjcxxDTO) {
        return this.tQyjcxxService.queryList(tQyjcxxDTO);
    }

    /**
     * 分页查询当前账户下所有企业基础信息表信息
     *
     * @return List<TQyjcxxDTO> 分页当前账户下所有企业基础信息表信息
     */
    @Operation(description = "分页企业基础信息表信息表数据", summary = "分页查询企业基础信息表信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TQyjcxxVO> selectPage(@ParameterObject Page<TQyjcxxDTO> page, @ParameterObject TQyjcxxDTO tQyjcxxDTO) {
        return this.tQyjcxxService.queryPage(page, tQyjcxxDTO);
    }

    /**
     * 查询企业基础信息表的所有字段信息
     *
     * @return 所有字段信息
     */
    @GetMapping("heads")
    @Hidden
    public List<TableInfoVO> heads() {
        // 查询所有列名
        List<TableInfoVO> queryInfos = this.commonService.queryTableHeaders("t_qyjcxx");
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
