package com.lyb.product.user.service;

import com.github.pagehelper.Page;
import com.lyb.product.user.entity.User;
import org.omg.PortableInterceptor.USER_EXCEPTION;

/**
 * @program: lyb-product
 * @description:
 * @author: xiexiangrui
 * @create: 2018-04-11 15:55
 **/
public interface UserService {

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(Integer id);

    User findById(Integer id);

    Page<User> findByPage(int pageNo,int pageSize);

    User findByLoginName(String loginName);
}
