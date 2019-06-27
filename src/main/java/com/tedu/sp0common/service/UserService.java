package com.tedu.sp0common.service;

import com.tedu.sp0common.pojo.User;

public interface UserService {
    User getUser(Integer id);
    void addScore(Integer id, Integer score);
}
