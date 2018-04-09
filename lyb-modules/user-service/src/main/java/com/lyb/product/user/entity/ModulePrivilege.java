package com.lyb.product.user.entity;

public class ModulePrivilege {
    private Integer mpId;

    private String modCode;

    private String priCode;

    public Integer getMpId() {
        return mpId;
    }

    public void setMpId(Integer mpId) {
        this.mpId = mpId;
    }

    public String getModCode() {
        return modCode;
    }

    public void setModCode(String modCode) {
        this.modCode = modCode == null ? null : modCode.trim();
    }

    public String getPriCode() {
        return priCode;
    }

    public void setPriCode(String priCode) {
        this.priCode = priCode == null ? null : priCode.trim();
    }
}