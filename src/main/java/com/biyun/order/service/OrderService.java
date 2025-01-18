package com.biyun.order.service;
import com.biyun.order.model.Order;
import com.biyun.order.model.Orders;

import java.util.List;

public interface OrderService {
    int insert(Orders order);

    List<Orders> query();
}
