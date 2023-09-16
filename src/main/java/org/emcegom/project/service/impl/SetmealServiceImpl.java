package org.emcegom.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.emcegom.project.entity.Setmeal;
import org.emcegom.project.mapper.SetmealMapper;
import org.emcegom.project.service.SetmealService;
import org.springframework.stereotype.Service;

@Service
public class SetmealServiceImpl extends ServiceImpl<SetmealMapper, Setmeal> implements SetmealService{
}
