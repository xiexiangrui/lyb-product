package com.lyb.product.auth.entity;

import java.io.Serializable;

public class Role implements Serializable {
    private static final long serialVersionUID = -6442086358702319846L;
    private Integer id;

    private String name;

    private String roleKey;

    private String description;

    private Integer status;

    private Integer datacompany;

    private String delFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRoleKey() {
        return roleKey;
    }

    public void setRoleKey(String roleKey) {
        this.roleKey = roleKey == null ? null : roleKey.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDatacompany() {
        return datacompany;
    }

    public void setDatacompany(Integer datacompany) {
        this.datacompany = datacompany;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}