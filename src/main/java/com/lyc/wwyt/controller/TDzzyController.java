package com.lyc.wwyt.controller;

import cn.allbs.excel.annotation.ExportExcel;
import cn.allbs.excel.annotation.Sheet;
import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.excel.CustomHead;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.dto.TDzzyDTO;
import com.lyc.wwyt.entity.TDzzyEntity;
import com.lyc.wwyt.entity.old.CmUnitEntity;
import com.lyc.wwyt.entity.old.SafeSpecialEntity;
import com.lyc.wwyt.service.CommonService;
import com.lyc.wwyt.service.TDzzyService;
import com.lyc.wwyt.service.old.SafeSpecialService;
import com.lyc.wwyt.utils.NameUtils;
import com.lyc.wwyt.vo.TDzzyVO;
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
 * 吊装作业信息表(t_dzzy)表控制层
 *
 * @author lhh
 * @since 2023-05-22 17:47:36
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_dzzy")
@Tag(name = "吊装作业信息表", description = "吊装作业信息表 管理")
@OpenAPIDefinition(info = @Info(title = "吊装作业信息表 Api", version = "v1", description = "吊装作业信息表 管理"))
public class TDzzyController {

    /**
     * 服务对象
     */
    private final TDzzyService tDzzyService;

    /**
     * 通用数据查询
     */
    private final CommonService commonService;

    private final SafeSpecialService safeSpecialService;

    /**
     * 吊装作业信息表新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "吊装作业信息表数据新增或修改", summary = "多条吊装作业信息表数据新增或修改", tags = {"数据保存"})
    @SysLog("吊装作业信息表数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TDzzyDTO> list) {
        List<TDzzyEntity> entityList = new ArrayList<>(list);
        this.tDzzyService.saveOrUpdateBatch(entityList);
        List<SafeSpecialEntity> saveList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(entityList)) {
            for (TDzzyEntity dto : entityList) {
                CmUnitEntity unit = commonService.queryUnitId(dto.getTyshxydm());
                SafeSpecialEntity entity = SafeSpecialEntity.builder()
                        .tId(dto.getId())
                        .unitId(unit.getUnitId())
                        .name(dto.getZyzbh())
                        .code(dto.getZyzbh())
                        .address(dto.getZywz())
                        .applyPerson(dto.getSqr())
                        .operator(dto.getZyryxx())
                        .startTime(Date.from(dto.getZysskssj().atZone(ZoneId.systemDefault()).toInstant()))
                        .endTime(Date.from(dto.getZyssjssj().atZone(ZoneId.systemDefault()).toInstant()))
                        .longitude(dto.getLongitude())
                        .latitude(dto.getLatitude())
                        .build();
                entity.setDelFlg(dto.getDeleteMark());
                entity.setCreateId(1L);
                entity.setUpdateId(1L);
                entity.setCreateTime(new java.util.Date());
                entity.setUpdateTime(new java.util.Date());
                saveList.add(entity);
            }
//            safeSpecialService.saveOrUpdateBatch(saveList);
        }
    }

    /**
     * 查询当前账户下所有吊装作业信息表信息
     *
     * @return List<TDzzyEntity> 当前账户下所有吊装作业信息表信息
     */
    @Operation(description = "查询吊装作业信息表信息表数据", summary = "查询吊装作业信息表信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    @ExportExcel(name = "吊装作业信息表", sheets = @Sheet(sheetName = "t_dzzy"), headGenerator = CustomHead.class)
    public List<TDzzyVO> selectAll(@ParameterObject TDzzyDTO tDzzyDTO) {
        return this.tDzzyService.queryList(tDzzyDTO);
    }

    /**
     * 分页查询当前账户下所有吊装作业信息表信息
     *
     * @return List<TDzzyDTO> 分页当前账户下所有吊装作业信息表信息
     */
    @Operation(description = "分页吊装作业信息表信息表数据", summary = "分页查询吊装作业信息表信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TDzzyVO> selectPage(@ParameterObject Page<TDzzyDTO> page, @ParameterObject TDzzyDTO tDzzyDTO) {
        return this.tDzzyService.queryPage(page, tDzzyDTO);
    }

    /**
     * 查询吊装作业信息表的所有字段信息
     *
     * @return 所有字段信息
     */
    @GetMapping("heads")
    @Hidden
    public List<TableInfoVO> heads() {
        // 查询所有列名
        List<TableInfoVO> queryInfos = this.commonService.queryTableHeaders("t_dzzy");
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
