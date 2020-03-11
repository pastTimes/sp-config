package com.yune.controller;

import com.yune.dto.ItemDto;
import com.yune.service.ItemService;
import com.yune.util.JsonResult;
import io.swagger.annotations.ApiModelProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
public class ItemController {
    @Resource
    private ItemService itemService;
    @Value("${server.port}")
    private int port;

    @GetMapping("/{orderId}")
    @ApiModelProperty("order")
    public JsonResult<List<ItemDto>> getItems(@PathVariable String orderId){
        log.info("server.port="+port+", orderId="+orderId);
        List<ItemDto> itemDtos = itemService.getItems(orderId);
        return JsonResult.ok(itemDtos).msg("port = "+port);
    }
    @PostMapping("/decreaseNumber")
    public JsonResult decreaseNumber(@RequestBody List<ItemDto> items) {
        itemService.decreaseNumbers(items);
        return JsonResult.ok();
    }
}
