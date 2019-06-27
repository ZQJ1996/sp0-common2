package com.tedu.sp04orderservice.feignclient;

import com.tedu.Web.util.JsonResult;
import com.tedu.sp0common.pojo.User;
import org.springframework.stereotype.Component;


@Component
public class UserFeignServiceFB implements UserFeignService {

    @Override
    public JsonResult<User> getUser(Integer userId) {
        if (Math.random() < 0.4) {
            return JsonResult.ok(new User(userId, "缓存name" + userId, "缓存pwd" + userId));
        }
        return JsonResult.err("无法获取用户信息");
    }

    @Override
    public JsonResult addScore(Integer userId, Integer score) {
        return JsonResult.err("无法增加用户积分");
    }

}
