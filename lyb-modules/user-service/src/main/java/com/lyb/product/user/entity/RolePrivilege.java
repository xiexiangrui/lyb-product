package com.lyb.product.user.entity;

public class RolePrivilege {
    private Integer rpId;

    private String roleCode;

    private Integer mpId;

    public Integer getRpId() {
        return rpId;
    }

    public void setRpId(Integer rpId) {
        this.rpId = rpId;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    public Integer getMpId() {
        return mpId;
    }

    public void setMpId(Integer mpId) {
        this.mpId = mpId;
    }
}