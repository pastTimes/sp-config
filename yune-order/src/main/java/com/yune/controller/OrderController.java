package com.yune.controller;

import com.yune.dto.ItemDto;
import com.yune.dto.OrderDto;
import com.yune.dto.UserDto;
import com.yune.service.OrderSrvice;
import com.yune.util.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


@Slf4j
@RestController
public class OrderController {
    @Autowired
    private OrderSrvice OrderSrvice;


    @GetMapping("/{orderId}")
    public JsonResult<OrderDto> getOrder(@PathVariable String orderId){
        log.info("get order ,id = "+orderId);
        OrderDto order = OrderSrvice.getOrder(orderId);
        return JsonResult.ok(order);
    }
    @GetMapping("/")
    public JsonResult addOrder() {
        //模拟post提交的数据
        OrderDto order = new OrderDto();
        order.setId(123456L)
                .setUserDto(new UserDto().setId(7).setPassword(null).setUsername(null))
                .setItemDtos(Arrays.asList(new ItemDto[] {
                        new ItemDto(1l,"aaa",2),
                        new ItemDto(2l,"bbb",1),
                        new ItemDto(3l,"ccc",3),
                        new ItemDto(4l,"ddd",1),
                        new ItemDto(5l,"eee",5),
                }));
        OrderSrvice.addOrder(order);
        return JsonResult.ok();
    }
}
