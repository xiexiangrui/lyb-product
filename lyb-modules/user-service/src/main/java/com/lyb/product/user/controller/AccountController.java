package com.lyb.product.user.controller;

import com.github.pagehelper.Page;
import com.lyb.product.common.util.AjaxResponse;
import com.lyb.product.common.util.PageInfo;
import com.lyb.product.user.entity.Account;
import com.lyb.product.user.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @program: lyb-product
 * @description:
 * @author: xiexiangrui
 * @create: 2018-04-09 17:28
 **/
@RestController
@RequestMapping(value = "/account")
public class AccountController {
    @Value("${server.port}")
    String port;

    @Autowired
    private AccountService accountService;

    /**
     * 新增
     * @param account
     * @return
     */
    @PostMapping("/add")
    public AjaxResponse addAccount(@RequestBody Account account){
        if(accountService.addAccount(account) < 0){
            return AjaxResponse.returnError(null,"add error");
        }
        return AjaxResponse.returnSuccess(account,"success");
    }

    /**
     * 分页列表
     * @param pageNo
     * @param pageSize
     * @return
     */
    @PostMapping("/pageList")
    public AjaxResponse pageList(@RequestParam(value = "pageNo") Integer pageNo, @RequestParam(value = "pageSize") Integer pageSize){
        if(null == pageNo || null == pageSize){
            return AjaxResponse.returnError(null,"Page params is null");
        }
        Page<Account> persons = accountService.findByPage(pageNo, pageSize);
        // 需要把Page包装成PageInfo对象才能序列化。该插件也默认实现了一个PageInfo
        PageInfo<Account> pageInfo = new PageInfo<>(persons);
        return AjaxResponse.returnSuccess(pageInfo,"form server port: "+port+" success");
    }
}
