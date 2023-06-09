package com.lyc.wwyt.controller;

import cn.allbs.excel.annotation.ExportExcel;
import cn.allbs.excel.annotation.Sheet;
import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.excel.CustomHead;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.entity.TDhzyEntity;
import com.lyc.wwyt.entity.TDtzyEntity;
import com.lyc.wwyt.entity.old.CmUnitEntity;
import com.lyc.wwyt.entity.old.SafeSpecialEntity;
import com.lyc.wwyt.service.TDtzyService;
import com.lyc.wwyt.service.CommonService;
import com.lyc.wwyt.dto.TDtzyDTO;
import com.lyc.wwyt.service.old.SafeSpecialService;
import com.lyc.wwyt.vo.TDtzyVO;
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
import java.sql.Date;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 动土作业信息表(t_dtzy)表控制层
 *
 * @author lhh
 * @since 2023-05-22 17:47:36
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_dtzy")
@Tag(name = "动土作业信息表", description = "动土作业信息表 管理")
@OpenAPIDefinition(info = @Info(title = "动土作业信息表 Api", version = "v1", description = "动土作业信息表 管理"))
public class TDtzyController {

    /**
     * 服务对象
     */
    private final TDtzyService tDtzyService;

    /**
     * 通用数据查询
     */
    private final CommonService commonService;

    private final SafeSpecialService safeSpecialService;

    /**
     * 动土作业信息表新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "动土作业信息表数据新增或修改", summary = "多条动土作业信息表数据新增或修改", tags = {"数据保存"})
    @SysLog("动土作业信息表数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TDtzyDTO> list) {
        List<TDtzyEntity> entityList = new ArrayList<>(list);
        this.tDtzyService.saveOrUpdateBatch(entityList);
        List<SafeSpecialEntity> saveList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(entityList)) {
            for (TDtzyEntity dto : entityList) {
                CmUnitEntity unit = commonService.queryUnitId(dto.getTyshxydm());
                SafeSpecialEntity entity = SafeSpecialEntity.builder()
                        .tId(dto.getId())
                        .unitId(unit.getUnitId())
                        .name(dto.getZyzbh())
                        .code(dto.getZyzbh())
                        .address(dto.getZywz())
                        .applyPerson(dto.getSqr())
                        .operator(dto.getZyfzr())
                        .startTime(Date.from(dto.getZysskssj().atZone(ZoneId.systemDefault()).toInstant()))
                        .endTime(Date.from(dto.getZyssjssj().atZone(ZoneId.systemDefault()).toInstant()))
                        .longitude(dto.getLongitude())
                        .latitude(dto.getLatitude())
                        .build();
                entity.setDelFlg(dto.getDeleteMark());
                entity.setCreateId(1L);
                entity.setUpdateId(1L);
                entity.setCreateTime(Date.from(dto.getCreateTime().atZone(ZoneId.systemDefault()).toInstant()));
                entity.setUpdateTime(Date.from(dto.getUpdateTime().atZone(ZoneId.systemDefault()).toInstant()));
                saveList.add(entity);
            }
            safeSpecialService.saveOrUpdateBatch(saveList);
        }
    }

    /**
     * 查询当前账户下所有动土作业信息表信息
     *
     * @return List<TDtzyEntity> 当前账户下所有动土作业信息表信息
     */
    @Operation(description = "查询动土作业信息表信息表数据", summary = "查询动土作业信息表信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    @ExportExcel(name = "动土作业信息表", sheets = @Sheet(sheetName = "t_dtzy"), headGenerator = CustomHead.class)
    public List<TDtzyVO> selectAll(@ParameterObject TDtzyDTO tDtzyDTO) {
        return this.tDtzyService.queryList(tDtzyDTO);
    }

    /**
     * 分页查询当前账户下所有动土作业信息表信息
     *
     * @return List<TDtzyDTO> 分页当前账户下所有动土作业信息表信息
     */
    @Operation(description = "分页动土作业信息表信息表数据", summary = "分页查询动土作业信息表信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TDtzyVO> selectPage(@ParameterObject Page<TDtzyDTO> page, @ParameterObject TDtzyDTO tDtzyDTO) {
        return this.tDtzyService.queryPage(page, tDtzyDTO);
    }

    /**
     * 查询动土作业信息表的所有字段信息
     *
     * @return 所有字段信息
     */
    @GetMapping("heads")
    @Hidden
    public List<TableInfoVO> heads() {
        // 查询所有列名
        List<TableInfoVO> queryInfos = this.commonService.queryTableHeaders("t_dtzy");
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
