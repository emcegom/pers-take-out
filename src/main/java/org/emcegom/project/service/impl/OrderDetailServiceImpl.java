package org.emcegom.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.emcegom.project.entity.OrderDetail;
import org.emcegom.project.mapper.OrderDetailMapper;
import org.emcegom.project.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}