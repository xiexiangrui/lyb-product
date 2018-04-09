package com.lyb.product.user.mapper;

import com.github.pagehelper.Page;
import com.lyb.product.user.entity.Account;

public interface AccountMapper {
    int deleteByPrimaryKey(Integer accId);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer accId);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);

    Page<Account> findByPage();
}