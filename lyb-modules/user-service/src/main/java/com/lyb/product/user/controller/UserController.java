package com.lyb.product.user.controller;

import com.github.pagehelper.Page;
import com.lyb.product.common.util.AjaxResponse;
import com.lyb.product.user.entity.User;
import com.lyb.product.user.service.UserService;
import com.lyb.product.user.util.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping(value = "/user")
public class UserController {

    private static final PasswordEncoder ENCODER = new BCryptPasswordEncoder();


    @Autowired
    private UserService userService;

    /**
     * 新增
     * @param user
     * @return
     */
    @PostMapping("/add")
    public AjaxResponse addUser(@RequestBody User user){
        user.setPassword(ENCODER.encode(user.getPassword()).trim());
        if(userService.addUser(user) < 0){
            return AjaxResponse.returnError(null,"add error");
        }
        return AjaxResponse.returnSuccess(user,"success");
    }

    /**
     * 更新
     * @param user
     * @return
     */
    @PostMapping("/update")
    public AjaxResponse updateUser(@RequestBody User user){
        user.setPassword(ENCODER.encode(user.getPassword()).trim());
        if(null == user.getId()){
            return AjaxResponse.returnError(null,"account id is null");
        }
        if(userService.updateUser(user) < 0){
            return AjaxResponse.returnError(null,"update error");
        }
        return AjaxResponse.returnSuccess(user,"success");
    }


    /**
     * 根据用户名查询
     * @param loginName
     * @return
     */
    @GetMapping("/findByName/{loginName}")
    public AjaxResponse findByName(@PathVariable("loginName") String loginName){

        if(StringUtils.isBlank(loginName)){
            return AjaxResponse.returnError(null,"account Name is null");
        }
        User user = userService.findByLoginName(loginName);
        if(null == user){
            return AjaxResponse.returnError(null,"no data");
        }
        return AjaxResponse.returnSuccess(user,"success");
        /*User user = userService.findByLoginName(loginName);
        return user;*/
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
        Page<User> users = userService.findByPage(pageNo, pageSize);
        // 需要把Page包装成PageInfo对象才能序列化。该插件也默认实现了一个PageInfo
        PageInfo<User> pageInfo = new PageInfo<>(users);
        return AjaxResponse.returnSuccess(pageInfo,"success");
    }


}
