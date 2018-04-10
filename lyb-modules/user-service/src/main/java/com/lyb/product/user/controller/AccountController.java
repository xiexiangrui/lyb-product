package com.lyb.product.user.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.util.StringUtil;
import com.lyb.product.user.entity.Account;
import com.lyb.product.user.service.AccountService;
import com.lyb.product.user.util.AjaxResponse;
import com.lyb.product.user.util.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
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

    private static final PasswordEncoder ENCODER = new BCryptPasswordEncoder();
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
        account.setAccPassword(ENCODER.encode(account.getAccPassword()).trim());
        if(accountService.addAccount(account) < 0){
            return AjaxResponse.returnError(null,"add error");
        }
        return AjaxResponse.returnSuccess(account,"success");
    }

    /**
     * 更新
     * @param account
     * @return
     */
    @PostMapping("/update")
    public AjaxResponse updateAccount(@RequestBody Account account){
        account.setAccPassword(ENCODER.encode(account.getAccPassword()).trim());
        if(null == account.getAccId()){
            return AjaxResponse.returnError(null,"account id is null");
        }
        if(accountService.addAccount(account) < 0){
            return AjaxResponse.returnError(null,"update error");
        }
        return AjaxResponse.returnSuccess(account,"success");
    }


    /**
     * 根据用户名查询
     * @param accName
     * @return
     */
    @GetMapping("/findByName/{accName}")
    public Account findByName(@PathVariable("accName") String accName){

        /*if(StringUtils.isBlank(accName)){
            return AjaxResponse.returnError(null,"account Name is null");
        }
        Account account = accountService.findByName(accName);
        if(null == account){
            return AjaxResponse.returnError(null,"no data");
        }

        return AjaxResponse.returnSuccess(account,"success");*/

        Account account = accountService.findByName(accName);


        return account;
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
