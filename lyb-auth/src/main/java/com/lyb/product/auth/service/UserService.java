package com.lyb.product.auth.service;


import com.lyb.product.auth.entity.User;

public interface UserService {
    User findUserByLoginName(String loginName);
}
