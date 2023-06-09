package com.lyc.wwyt.controller;

import cn.allbs.excel.annotation.ExportExcel;
import cn.allbs.excel.annotation.Sheet;
import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.excel.CustomHead;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.dto.TScssxxDTO;
import com.lyc.wwyt.entity.TScssxxEntity;
import com.lyc.wwyt.entity.old.CmUnitEntity;
import com.lyc.wwyt.entity.old.EquipmentEntity;
import com.lyc.wwyt.service.CommonService;
import com.lyc.wwyt.service.TScssxxService;
import com.lyc.wwyt.service.old.EquipmentService;
import com.lyc.wwyt.utils.NameUtils;
import com.lyc.wwyt.vo.TScssxxVO;
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
import java.sql.Date;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 生产设施信息表(t_scssxx)表控制层
 *
 * @author lhh
 * @since 2023-05-22 17:49:12
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_scssxx")
@Tag(name = "生产设施信息表", description = "生产设施信息表 管理")
@OpenAPIDefinition(info = @Info(title = "生产设施信息表 Api", version = "v1", description = "生产设施信息表 管理"))
public class TScssxxController {

    /**
     * 服务对象
     */
    private final TScssxxService tScssxxService;

    /**
     * 通用数据查询
     */
    private final CommonService commonService;

    private final EquipmentService equipmentService;

    /**
     * 生产设施信息表新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "生产设施信息表数据新增或修改", summary = "多条生产设施信息表数据新增或修改", tags = {"数据保存"})
    @SysLog("生产设施信息表数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TScssxxDTO> list) {
        List<TScssxxEntity> entityList = new ArrayList<>(list);
        this.tScssxxService.saveOrUpdateBatch(entityList);
        List<EquipmentEntity> saveList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(list)) {
            for (TScssxxDTO dto : list) {
                CmUnitEntity unit = commonService.queryUnitId(dto.getTyshxydm());
                EquipmentEntity entity = EquipmentEntity.builder()
                        .tId(dto.getId())
                        .unitId(unit.getUnitId())
                        .name(dto.getZzssmc())
                        .equipCode(dto.getZzbm())
                        .modal(dto.getZzssxh())
                        .makeTime(Date.from(dto.getScrq().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()))
                        .useTime(dto.getSyqx()/12)
                        .useDate(Date.from(dto.getTyrq().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()))
                        .leadPerson(dto.getFzr())
                        .isSpecialFlg("1".equals(dto.getLxlb())?1:0)
                        .equipType("1".equals(dto.getLxlb())?2:1)
                        .build();
                entity.setDelFlg(dto.getDeleteMark());
                entity.setCreateId(1L);
                entity.setUpdateId(1L);
                entity.setCreateTime(Date.from(dto.getCreateTime().atZone(ZoneId.systemDefault()).toInstant()));
                entity.setUpdateTime(Date.from(dto.getUpdateTime().atZone(ZoneId.systemDefault()).toInstant()));
                saveList.add(entity);
            }
            equipmentService.saveOrUpdateBatch(saveList);
        }
    }

    /**
     * 查询当前账户下所有生产设施信息表信息
     *
     * @return List<TScssxxEntity> 当前账户下所有生产设施信息表信息
     */
    @Operation(description = "查询生产设施信息表信息表数据", summary = "查询生产设施信息表信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    @ExportExcel(name = "生产设施信息表", sheets = @Sheet(sheetName = "t_scssxx"), headGenerator = CustomHead.class)
    public List<TScssxxVO> selectAll(@ParameterObject TScssxxDTO tScssxxDTO) {
        return this.tScssxxService.queryList(tScssxxDTO);
    }

    /**
     * 分页查询当前账户下所有生产设施信息表信息
     *
     * @return List<TScssxxDTO> 分页当前账户下所有生产设施信息表信息
     */
    @Operation(description = "分页生产设施信息表信息表数据", summary = "分页查询生产设施信息表信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TScssxxVO> selectPage(@ParameterObject Page<TScssxxDTO> page, @ParameterObject TScssxxDTO tScssxxDTO) {
        return this.tScssxxService.queryPage(page, tScssxxDTO);
    }

    /**
     * 查询生产设施信息表的所有字段信息
     *
     * @return 所有字段信息
     */
    @GetMapping("heads")
    @Hidden
    public List<TableInfoVO> heads() {
        // 查询所有列名
        List<TableInfoVO> queryInfos = this.commonService.queryTableHeaders("t_scssxx");
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
