package com.yune.service;

import com.yune.dto.OrderDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderServiceImpl implements OrderSrvice {

    @Override
    public OrderDto getOrder(String orderId) {
        OrderDto order = new OrderDto();
        order.setId(Long.parseLong(orderId));
        return order;
    }

    @Override
    public void addOrder(OrderDto order) {
        log.info("保存订单"+order);
    }
}
