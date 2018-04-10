package com.lyb.product.auth.util;

import com.lyb.product.common.vo.UserVo;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * @program: lyb-product
 * @description:
 * @author: xiexiangrui
 * @create: 2018-04-10 17:11
 **/
public class UserDetailsImpl implements UserDetails {

    private String username;
    private String password;
    private String status;
    private String userCode;

    public UserDetailsImpl(UserVo userVo) {
        this.username = userVo.getAccName();
        this.password = userVo.getAccPassword();
        this.userCode = userVo.getAccCode();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
