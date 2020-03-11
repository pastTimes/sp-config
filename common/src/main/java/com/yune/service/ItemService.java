package com.yune.service;

import com.yune.dto.ItemDto;

import java.util.List;

public interface ItemService {

    /**
     * 通过orderId获取菜单列表
     * @param orderId
     * @return
     */
    List<ItemDto> getItems(String orderId);

    /**
     *
     * @param list
     */
    void decreaseNumbers(List<ItemDto> list);
}
