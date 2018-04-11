package com.lyb.product.user.mapper;

import com.github.pagehelper.Page;
import com.lyb.product.user.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    Page<User> findByPage();

    User findByLoginNmae(String loginName);
}