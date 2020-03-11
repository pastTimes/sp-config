package com.yune.service;

import com.yune.dto.OrderDto;

public interface OrderSrvice {
    OrderDto getOrder(String orderId);

    void addOrder(OrderDto order);
}
