package com.lyb.product.user.mapper;

import com.lyb.product.user.entity.Module;

public interface ModuleMapper {
    int deleteByPrimaryKey(Integer modId);

    int insert(Module record);

    int insertSelective(Module record);

    Module selectByPrimaryKey(Integer modId);

    int updateByPrimaryKeySelective(Module record);

    int updateByPrimaryKey(Module record);
}