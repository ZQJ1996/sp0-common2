package com.tedu.sp0common.service;

import com.tedu.sp0common.pojo.Item;

import java.util.List;

public interface ItemService {
    List<Item> getItems(String orderId);
    void decreaseNumbers(List<Item> list);

}
