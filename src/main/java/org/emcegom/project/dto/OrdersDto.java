package org.emcegom.project.dto;

import lombok.Data;
import org.emcegom.project.entity.OrderDetail;
import org.emcegom.project.entity.Orders;

import java.util.List;

@Data
public class OrdersDto extends Orders {

    private String userName;

    private String phone;

    private String address;

    private String consignee;

    private List<OrderDetail> orderDetails;

}
