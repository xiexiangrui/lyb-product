package com.lyb.product.user.entity;

public class Role {
    private Integer id;

    private String name;

    private String roleKey;

    private String description;

    private Integer status;

    private Integer datacompany;

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
}