package com.lyb.product.user.mapper;

import com.lyb.product.user.entity.ModulePrivilege;

public interface ModulePrivilegeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ModulePrivilege record);

    int insertSelective(ModulePrivilege record);

    ModulePrivilege selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ModulePrivilege record);

    int updateByPrimaryKey(ModulePrivilege record);
}