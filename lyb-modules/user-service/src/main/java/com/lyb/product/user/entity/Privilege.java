package com.lyb.product.user.entity;

public class Privilege {
    private Integer priId;

    private String priCode;

    private String priName;

    public Integer getPriId() {
        return priId;
    }

    public void setPriId(Integer priId) {
        this.priId = priId;
    }

    public String getPriCode() {
        return priCode;
    }

    public void setPriCode(String priCode) {
        this.priCode = priCode == null ? null : priCode.trim();
    }

    public String getPriName() {
        return priName;
    }

    public void setPriName(String priName) {
        this.priName = priName == null ? null : priName.trim();
    }
}