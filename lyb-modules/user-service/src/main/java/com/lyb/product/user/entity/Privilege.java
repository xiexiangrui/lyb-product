package com.lyb.product.user.entity;

public class Privilege {
    private Integer id;

    private String priKey;

    private String priName;

    private String description;

    private Integer datacompany;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPriKey() {
        return priKey;
    }

    public void setPriKey(String priKey) {
        this.priKey = priKey == null ? null : priKey.trim();
    }

    public String getPriName() {
        return priName;
    }

    public void setPriName(String priName) {
        this.priName = priName == null ? null : priName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getDatacompany() {
        return datacompany;
    }

    public void setDatacompany(Integer datacompany) {
        this.datacompany = datacompany;
    }
}