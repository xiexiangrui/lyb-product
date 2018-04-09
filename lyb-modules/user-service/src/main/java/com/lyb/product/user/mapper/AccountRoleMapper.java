package com.lyb.product.user.mapper;

import com.lyb.product.user.entity.AccountRole;

public interface AccountRoleMapper {
    int deleteByPrimaryKey(Integer arId);

    int insert(AccountRole record);

    int insertSelective(AccountRole record);

    AccountRole selectByPrimaryKey(Integer arId);

    int updateByPrimaryKeySelective(AccountRole record);

    int updateByPrimaryKey(AccountRole record);
}