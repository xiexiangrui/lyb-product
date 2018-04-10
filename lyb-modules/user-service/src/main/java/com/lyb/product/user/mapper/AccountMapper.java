package com.lyb.product.user.mapper;

import com.github.pagehelper.Page;
import com.lyb.product.user.entity.Account;
import org.apache.ibatis.annotations.Param;

public interface AccountMapper {
    int deleteByPrimaryKey(Integer accId);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer accId);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);

    Page<Account> findByPage();

    Account findByName(String accName);
}