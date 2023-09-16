package org.emcegom.project.controller;


import lombok.extern.slf4j.Slf4j;
import org.emcegom.project.common.Result;
import org.emcegom.project.entity.Category;
import org.emcegom.project.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    @PostMapping
    public Result<String> save(@RequestBody Category category) {
        log.info("category:{}", category);
        categoryService.save(category);
        return Result.success("新增分类成功");
    }
}
