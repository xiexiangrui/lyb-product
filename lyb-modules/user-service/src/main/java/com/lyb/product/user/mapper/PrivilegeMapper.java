package com.lyb.product.user.mapper;

import com.lyb.product.user.entity.Privilege;

public interface PrivilegeMapper {
    int deleteByPrimaryKey(Integer priId);

    int insert(Privilege record);

    int insertSelective(Privilege record);

    Privilege selectByPrimaryKey(Integer priId);

    int updateByPrimaryKeySelective(Privilege record);

    int updateByPrimaryKey(Privilege record);
}