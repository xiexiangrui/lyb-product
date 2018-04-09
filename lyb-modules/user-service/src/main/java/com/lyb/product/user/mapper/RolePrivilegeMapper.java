package com.lyb.product.user.mapper;

import com.lyb.product.user.entity.RolePrivilege;

public interface RolePrivilegeMapper {
    int deleteByPrimaryKey(Integer rpId);

    int insert(RolePrivilege record);

    int insertSelective(RolePrivilege record);

    RolePrivilege selectByPrimaryKey(Integer rpId);

    int updateByPrimaryKeySelective(RolePrivilege record);

    int updateByPrimaryKey(RolePrivilege record);
}