package com.lyb.product.user.entity;

public class Account {
    private Integer accId;

    private String accCode;

    private String accName;

    private String accPassword;

    public Integer getAccId() {
        return accId;
    }

    public void setAccId(Integer accId) {
        this.accId = accId;
    }

    public String getAccCode() {
        return accCode;
    }

    public void setAccCode(String accCode) {
        this.accCode = accCode == null ? null : accCode.trim();
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName == null ? null : accName.trim();
    }

    public String getAccPassword() {
        return accPassword;
    }

    public void setAccPassword(String accPassword) {
        this.accPassword = accPassword == null ? null : accPassword.trim();
    }
}