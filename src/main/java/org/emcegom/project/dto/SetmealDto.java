package org.emcegom.project.dto;

import lombok.Data;
import org.emcegom.project.entity.Setmeal;
import org.emcegom.project.entity.SetmealDish;

import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
