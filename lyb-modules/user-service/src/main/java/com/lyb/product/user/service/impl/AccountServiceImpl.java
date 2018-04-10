package com.lyb.product.user.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lyb.product.user.entity.Account;
import com.lyb.product.user.mapper.AccountMapper;
import com.lyb.product.user.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: lyb-product
 * @description:
 * @author: xiexiangrui
 * @create: 2018-04-09 17:22
 **/
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public int deleteAccount(Integer accId) {
        return accountMapper.deleteByPrimaryKey(accId);
    }

    @Override
    public int addAccount(Account record) {
        return accountMapper.insertSelective(record);
    }

    @Override
    public int updateAccount(Account record) {
        return accountMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public Account selectById(Integer accId) {
        return accountMapper.selectByPrimaryKey(accId);
    }

    @Override
    public Page<Account> findByPage(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        return accountMapper.findByPage();
    }

    @Override
    public Account findByName(String accName) {
        return accountMapper.findByName(accName);
    }
}
