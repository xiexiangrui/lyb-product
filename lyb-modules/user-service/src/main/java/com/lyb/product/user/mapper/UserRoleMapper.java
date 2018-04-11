package com.lyb.product.user.mapper;

import com.lyb.product.user.entity.UserRole;

public interface UserRoleMapper {
    int insert(UserRole record);

    int insertSelective(UserRole record);
}