package org.emcegom.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.emcegom.project.entity.Orders;

@Mapper
public interface OrderMapper extends BaseMapper<Orders> {
}