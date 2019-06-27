package com.tedu.sp0common.service;

import com.tedu.sp0common.pojo.Order;

public interface OrderService {
    Order getOrder(String orderId);
    void addOrder(Order order);
}
