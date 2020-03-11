package com.yune.service;

import com.yune.dto.ItemDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class ItemServiceImpl implements ItemService{
    @Override
    public List<ItemDto> getItems(String orderId) {
        ArrayList<ItemDto> list = new ArrayList<>();
        list.add(new ItemDto(1l,"商品 1",1));
        list.add(new ItemDto(2L,"商品 2",2));
        list.add(new ItemDto(3L,"商品 3",3));
        list.add(new ItemDto(4L,"商品 4",4));
        list.add(new ItemDto(5L,"商品 5",5));
        return list;
    }

    @Override
    public void decreaseNumbers(List<ItemDto> list) {
        for(ItemDto item : list) {
            log.info("减少库存 - "+item);
        }
    }
}
