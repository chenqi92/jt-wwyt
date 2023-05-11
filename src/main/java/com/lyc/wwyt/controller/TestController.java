package com.lyc.wwyt.controller;

import com.lyc.wwyt.entity.TDictEntity;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 类 TestController
 *
 * @author ChenQi
 * @date 2023/5/11
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/test")
@Tag(name = "test", description = "接口测试")
public class TestController {

    @PostMapping("/info")
    public void test(@RequestBody @Valid TDictEntity dict) {
    }
}
