package com.lyc.wwyt.controller;

import cn.allbs.excel.annotation.ExportExcel;
import cn.allbs.excel.annotation.Sheet;
import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.excel.CustomHead;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.dto.TLsydzyDTO;
import com.lyc.wwyt.entity.TLsydzyEntity;
import com.lyc.wwyt.service.CommonService;
import com.lyc.wwyt.service.TLsydzyService;
import com.lyc.wwyt.utils.NameUtils;
import com.lyc.wwyt.vo.TLsydzyVO;
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
 * 临时用电信息表(t_lsydzy)表控制层
 *
 * @author lhh
 * @since 2023-05-22 17:48:30
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_lsydzy")
@Tag(name = "临时用电信息表", description = "临时用电信息表 管理")
@OpenAPIDefinition(info = @Info(title = "临时用电信息表 Api", version = "v1", description = "临时用电信息表 管理"))
public class TLsydzyController {

    /**
     * 服务对象
     */
    private final TLsydzyService tLsydzyService;

    /**
     * 通用数据查询
     */
    private final CommonService commonService;

    /**
     * 临时用电信息表新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "临时用电信息表数据新增或修改", summary = "多条临时用电信息表数据新增或修改", tags = {"数据保存"})
    @SysLog("临时用电信息表数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TLsydzyDTO> list) {
        List<TLsydzyEntity> entityList = new ArrayList<>(list);
        this.tLsydzyService.saveOrUpdateBatch(entityList);
    }

    /**
     * 查询当前账户下所有临时用电信息表信息
     *
     * @return List<TLsydzyEntity> 当前账户下所有临时用电信息表信息
     */
    @Operation(description = "查询临时用电信息表信息表数据", summary = "查询临时用电信息表信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    @ExportExcel(name = "临时用电信息表", sheets = @Sheet(sheetName = "t_lsydzy"), headGenerator = CustomHead.class)
    public List<TLsydzyVO> selectAll(@ParameterObject TLsydzyDTO tLsydzyDTO) {
        return this.tLsydzyService.queryList(tLsydzyDTO);
    }

    /**
     * 分页查询当前账户下所有临时用电信息表信息
     *
     * @return List<TLsydzyDTO> 分页当前账户下所有临时用电信息表信息
     */
    @Operation(description = "分页临时用电信息表信息表数据", summary = "分页查询临时用电信息表信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TLsydzyVO> selectPage(@ParameterObject Page<TLsydzyDTO> page, @ParameterObject TLsydzyDTO tLsydzyDTO) {
        return this.tLsydzyService.queryPage(page, tLsydzyDTO);
    }

    /**
     * 查询临时用电信息表的所有字段信息
     *
     * @return 所有字段信息
     */
    @GetMapping("heads")
    @Hidden
    public List<TableInfoVO> heads() {
        // 查询所有列名
        List<TableInfoVO> queryInfos = this.commonService.queryTableHeaders("t_lsydzy");
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
