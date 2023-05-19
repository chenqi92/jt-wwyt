package com.lyc.wwyt.controller;

import cn.allbs.excel.annotation.ExportExcel;
import cn.allbs.excel.annotation.Sheet;
import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.entity.TAqpxjcjlEntity;
import com.lyc.wwyt.service.TAqpxjcjlService;
import com.lyc.wwyt.service.CommonService;
import com.lyc.wwyt.dto.TAqpxjcjlDTO;
import com.lyc.wwyt.vo.TAqpxjcjlVO;
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
 * 安全培训奖惩记录表(t_aqpxjcjl)表控制层
 *
 * @author chenqi
 * @since 2023-05-19 14:57:26
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_aqpxjcjl")
@Tag(name = "安全培训奖惩记录表", description = "安全培训奖惩记录表 管理")
@OpenAPIDefinition(info = @Info(title = "安全培训奖惩记录表 Api", version = "v1", description = "安全培训奖惩记录表 管理"))
public class TAqpxjcjlController {

    /**
     * 服务对象
     */
    private final TAqpxjcjlService tAqpxjcjlService;

    /**
     * 通用数据查询
     */
    private final CommonService commonService;

    /**
     * 安全培训奖惩记录表新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "安全培训奖惩记录表数据新增或修改", summary = "多条安全培训奖惩记录表数据新增或修改", tags = {"数据保存"})
    @SysLog("安全培训奖惩记录表数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TAqpxjcjlDTO> list) {
        List<TAqpxjcjlEntity> entityList = new ArrayList<>(list);
        this.tAqpxjcjlService.saveOrUpdateBatch(entityList);
    }

    /**
     * 查询当前账户下所有安全培训奖惩记录表信息
     *
     * @return List<TAqpxjcjlEntity> 当前账户下所有安全培训奖惩记录表信息
     */
    @Operation(description = "查询安全培训奖惩记录表信息表数据", summary = "查询安全培训奖惩记录表信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    @ExportExcel(name = "安全培训奖惩记录表", sheets = @Sheet(sheetName = "t_aqpxjcjl"))
    public List<TAqpxjcjlVO> selectAll(@ParameterObject TAqpxjcjlDTO tAqpxjcjlDTO) {
        return this.tAqpxjcjlService.queryList(tAqpxjcjlDTO);
    }

    /**
     * 分页查询当前账户下所有安全培训奖惩记录表信息
     *
     * @return List<TAqpxjcjlDTO> 分页当前账户下所有安全培训奖惩记录表信息
     */
    @Operation(description = "分页安全培训奖惩记录表信息表数据", summary = "分页查询安全培训奖惩记录表信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TAqpxjcjlVO> selectPage(@ParameterObject Page<TAqpxjcjlDTO> page, @ParameterObject TAqpxjcjlDTO tAqpxjcjlDTO) {
        return this.tAqpxjcjlService.queryPage(page, tAqpxjcjlDTO);
    }

    /**
     * 查询安全培训奖惩记录表的所有字段信息
     *
     * @return 所有字段信息
     */
    @GetMapping("heads")
    @Hidden
    public List<TableInfoVO> heads() {
        // 查询所有列名
        List<TableInfoVO> queryInfos = this.commonService.queryTableHeaders("t_aqpxjcjl");
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
