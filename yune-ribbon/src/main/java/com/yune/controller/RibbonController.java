package com.yune.controller;

import com.yune.dto.ItemDto;
import com.yune.dto.OrderDto;
import com.yune.dto.UserDto;
import com.yune.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


/**
 *
 */
@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/item-service/{orderId}")
    public JsonResult<List<ItemDto>> getItems(@PathVariable String orderId){
        return restTemplate.getForObject("http://localhost:8001/1",JsonResult.class);
    }

    @PostMapping("/item-service/decreaseNumber")
    public JsonResult decreaseNumber(@PathVariable List<ItemDto> ItemDtos){
        return restTemplate.postForObject("http://localhost:8001/decreaseNumber",ItemDtos,JsonResult.class);
    }

    ///////////////////////////////////////
    @GetMapping("/user-service/{userId}")
    public JsonResult<UserDto> getUser(@PathVariable Integer userId){
        return restTemplate.getForObject("http://localhost:8101/1",JsonResult.class);
    }

    @GetMapping("/user-service/{userId}/score")
    public JsonResult addScore(@PathVariable Integer userId,Integer score){
        return restTemplate.getForObject("http:localhost:8101/1/score?score=2",JsonResult.class);

    }

    /////////////////////////////////////////////

    @GetMapping("/order-service/{orderId}")
    public JsonResult<OrderDto> getOrder(@PathVariable String orderId){
        return  restTemplate.getForObject("http:localhost:8201/1",JsonResult.class);
    }

    @GetMapping("/order-service")
    public JsonResult addOrder(){
        return restTemplate.getForObject("http:localhost:8201/",JsonResult.class);
    }
}
