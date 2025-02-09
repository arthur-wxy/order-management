package com.biyun.order.service.impl;

import com.biyun.order.mapper.OrdersMapper;
import com.biyun.order.model.Orders;
import com.biyun.order.model.OrdersExample;
import com.biyun.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrdersMapper ordersMapper;
    @Override
    public int insert(Orders order) {
       return ordersMapper.insert(order);
    }

    @Override
    public List<Orders> query() {
        try {
            System.out.println("enter");
            return ordersMapper.selectByExample(new OrdersExample());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
