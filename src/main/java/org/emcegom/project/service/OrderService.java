package org.emcegom.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.emcegom.project.entity.Orders;

public interface OrderService extends IService<Orders> {

    void submit(Orders orders);
}
