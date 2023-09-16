package org.emcegom.project.controller;

import lombok.extern.slf4j.Slf4j;
import org.emcegom.project.common.Result;
import org.emcegom.project.dto.DishDto;
import org.emcegom.project.service.DishFlavorService;
import org.emcegom.project.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/dish")
public class DishController {
    @Autowired
    private DishService dishService;
    @Autowired
    private DishFlavorService dishFlavorService;

    @PostMapping
    public Result<String> save(@RequestBody DishDto dishDto) {
        log.info("接收到的数据为：{}",dishDto);
        return null;
    }

}