package org.emcegom.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.emcegom.project.entity.Dish;
import org.emcegom.project.mapper.DishMapper;
import org.emcegom.project.service.DishService;
import org.springframework.stereotype.Service;

@Service
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish> implements DishService {

}
