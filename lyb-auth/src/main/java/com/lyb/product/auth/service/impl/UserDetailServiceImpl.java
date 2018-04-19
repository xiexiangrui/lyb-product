package com.lyb.product.auth.service.impl;

import com.lyb.product.auth.entity.User;
import com.lyb.product.auth.service.UserService;
import com.lyb.product.auth.util.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


/**
 * @program: lyb-product
 * @description:
 * @author: xiexiangrui
 * @create: 2018-04-10 17:07
 **/
@Service("userDetailService")
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userService.findUserByLoginName(s);
        if (user == null) {
            throw new UsernameNotFoundException(s);
        }
        return new UserDetailsImpl(user);
    }
}
