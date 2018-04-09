package com.lyb.product.user.service;

import com.github.pagehelper.Page;
import com.lyb.product.user.entity.Account;

/**
 * @program: lyb-product
 * @description:
 * @author: xiexiangrui
 * @create: 2018-04-09 17:17
 **/
public interface AccountService {
    int deleteAccount(Integer accId);

    int addAccount(Account record);

    int updateAccount(Account record);

    Account selectById(Integer accId);

    Page<Account> findByPage(int pageNo, int pageSize);
}
