package com.lyc.wwyt.controller;

import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.entity.TDictEntity;
import com.lyc.wwyt.service.TDictService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 五位一体_字典表(t_dict)表控制层
 *
 * @author chenqi
 * @since 2023-05-10 17:47:13
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/dict")
@Tag(name = "字典表接口", description = "五位一体_字典表 管理")
public class TDictController {

    /**
     * 服务对象
     */
    private final TDictService tDictService;

    /**
     * 新增 五位一体_字典表数据
     *
     * @param tDictEntity 五位一体_字典表数据
     */
    @Operation(description = "单条新增五位一体_字典表数据", summary = "单条保存", tags = {"saveOne"})
    @SysLog("单条新增五位一体_字典表数据")
    @PostMapping("saveOne")
    public void save(@RequestBody @Valid TDictEntity tDictEntity) {
        this.tDictService.save(tDictEntity);
    }

    /**
     * 新增 五位一体_字典表数据 默认多条保存
     *
     * @param list 五位一体_字典表数据list数据
     */
    @Operation(description = "一次保存多条五位一体_字典表数据", summary = "多条保存", tags = {"saveList"})
    @SysLog("一次保存多条五位一体_字典表数据")
    @PostMapping
    public void saveAll(@RequestBody @Valid List<TDictEntity> list) {
        this.tDictService.saveOrUpdateBatch(list);
    }

    /**
     * 查询当前用户所有数据
     */
    @Operation(description = "查询当前用户所有字典数据", summary = "查询所有数据", tags = {"searchAll"})
    @GetMapping
    public List<TDictEntity> searchAll() {
        return this.tDictService.list();
    }
}
