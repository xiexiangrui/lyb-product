package com.lyb.product.auth.mapper;


import com.lyb.product.auth.entity.UserRole;

public interface UserRoleMapper {
    int insert(UserRole record);

    int insertSelective(UserRole record);
}