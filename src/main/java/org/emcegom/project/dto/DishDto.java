package org.emcegom.project.dto;

import lombok.Data;
import org.emcegom.project.entity.Dish;
import org.emcegom.project.entity.DishFlavor;

import java.util.ArrayList;
import java.util.List;

@Data
public class DishDto extends Dish {
    //菜品口味
    private List<DishFlavor> flavors = new ArrayList<>();
    //菜品分类名称
    private String categoryName;

    private Integer copies;
}