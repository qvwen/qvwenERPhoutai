package com.example.erp.quwenjia.pojo;

import java.io.Serializable;
import java.util.List;

public class permission implements Serializable {
    private Integer permissionId;

    private String permissionName;

    private Integer fId;

    private String permissionIcon;

    private String permissionPath;

    private Integer permissionBool;

    private String permissionCode;

    private List<permission> permissions;   //权限集合

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public String getPermissionIcon() {
        return permissionIcon;
    }

    public void setPermissionIcon(String permissionIcon) {
        this.permissionIcon = permissionIcon == null ? null : permissionIcon.trim();
    }

    public String getPermissionPath() {
        return permissionPath;
    }

    public void setPermissionPath(String permissionPath) {
        this.permissionPath = permissionPath == null ? null : permissionPath.trim();
    }

    public Integer getPermissionBool() {
        return permissionBool;
    }

    public void setPermissionBool(Integer permissionBool) {
        this.permissionBool = permissionBool;
    }

    public String getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode == null ? null : permissionCode.trim();
    }
}