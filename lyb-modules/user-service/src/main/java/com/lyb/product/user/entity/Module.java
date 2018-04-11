package com.lyb.product.user.entity;

public class Module {
    private Integer id;

    private String modName;

    private String modKey;

    private String modIcon;

    private String modUrl;

    private Integer parentId;

    private String description;

    private Integer status;

    private Integer datacompany;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModName() {
        return modName;
    }

    public void setModName(String modName) {
        this.modName = modName == null ? null : modName.trim();
    }

    public String getModKey() {
        return modKey;
    }

    public void setModKey(String modKey) {
        this.modKey = modKey == null ? null : modKey.trim();
    }

    public String getModIcon() {
        return modIcon;
    }

    public void setModIcon(String modIcon) {
        this.modIcon = modIcon == null ? null : modIcon.trim();
    }

    public String getModUrl() {
        return modUrl;
    }

    public void setModUrl(String modUrl) {
        this.modUrl = modUrl == null ? null : modUrl.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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