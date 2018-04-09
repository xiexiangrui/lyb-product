package com.lyb.product.user.entity;

public class Module {
    private Integer modId;

    private String modCode;

    private String modName;

    private String parentCode;

    private String modUrl;

    public Integer getModId() {
        return modId;
    }

    public void setModId(Integer modId) {
        this.modId = modId;
    }

    public String getModCode() {
        return modCode;
    }

    public void setModCode(String modCode) {
        this.modCode = modCode == null ? null : modCode.trim();
    }

    public String getModName() {
        return modName;
    }

    public void setModName(String modName) {
        this.modName = modName == null ? null : modName.trim();
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    public String getModUrl() {
        return modUrl;
    }

    public void setModUrl(String modUrl) {
        this.modUrl = modUrl == null ? null : modUrl.trim();
    }
}