package org.emcegom.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.emcegom.project.entity.Category;
import org.emcegom.project.mapper.CategoryMapper;
import org.emcegom.project.service.CategoryService;
import org.springframework.stereotype.Service;


@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
