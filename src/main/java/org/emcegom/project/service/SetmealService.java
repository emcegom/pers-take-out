package org.emcegom.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.emcegom.project.dto.SetmealDto;
import org.emcegom.project.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {

    void saveWithDish(SetmealDto setmealDto);

    void removeWithDish(List<Long> ids);

    SetmealDto getByIdWithDish(Long id);

    void updateWithDish(SetmealDto setmealDto);
}
