package org.emcegom.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.emcegom.project.dto.DishDto;
import org.emcegom.project.entity.Dish;

public interface DishService extends IService<Dish> {
    void saveWithFlavor(DishDto dishDto);

    DishDto getByIdWithFlavor(Long id);

    void updateWithFlavor(DishDto dishDto);
}
