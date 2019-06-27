package com.tedu.sp09feign.service;


import com.tedu.Web.util.JsonResult;
import com.tedu.sp0common.pojo.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderFeignServiceFB implements OrderFeignService {

    @Override
    public JsonResult<Order> getOrder(String orderId) {
        return JsonResult.err("无法获取商品订单");
    }

    @Override
    public JsonResult addOrder() {
        return JsonResult.err("无法保存订单");
    }

}

