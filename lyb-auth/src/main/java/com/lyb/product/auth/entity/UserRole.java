package com.lyb.product.auth.entity;

import java.io.Serializable;

public class UserRole implements Serializable {
    private static final long serialVersionUID = -903965383670186930L;
    private Integer userId;

    private Integer roleId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}