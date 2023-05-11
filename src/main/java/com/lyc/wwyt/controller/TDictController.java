package com.lyc.wwyt.controller;

import cn.allbs.common.utils.R;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.entity.TDictEntity;
import com.lyc.wwyt.service.TDictService;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 五位一体_字典表(t_dict)表控制层
 *
 * @author chenqi
 * @since 2023-05-10 17:47:13
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/tDict")
@Tag(name = "tDict", description = "五位一体_字典表 管理")
public class TDictController {

    /**
     * 服务对象
     */
    private final TDictService tDictService;

    /**
     * 新增 五位一体_字典表
     *
     * @param tDictEntity 五位一体_字典表
     * @return R
     */
    @ApiOperation(value = "新增五位一体_字典表", notes = "新增五位一体_字典表")
    @SysLog("新增五位一体_字典表数据")
    @PostMapping
    public R save(@RequestBody @Valid TDictEntity tDictEntity) {
        return R.ok(this.tDictService.save(tDictEntity));
    }
}
