package com.tedu.sp09feign.service;

import com.tedu.Web.util.JsonResult;
import com.tedu.sp0common.pojo.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="order-service",fallback = OrderFeignServiceFB.class)
public interface OrderFeignService {
    @GetMapping("/{orderId}")
    JsonResult<Order> getOrder(@PathVariable String orderId);

    @GetMapping("/")
    JsonResult addOrder();

}
