package com.example.erp.quwenjia.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class role implements Serializable {
    private Integer roleId;

    private String roleName;

    private Integer roleState;

    private Date roleDate;

    private String roleCode;

    private Integer roleUser;
    
    private List<permission> permissions;   //权限集合
    
    
    public List<permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<permission> permissions) {
		this.permissions = permissions;
	}

	public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Integer getRoleState() {
        return roleState;
    }

    public void setRoleState(Integer roleState) {
        this.roleState = roleState;
    }

    public Date getRoleDate() {
        return roleDate;
    }

    public void setRoleDate(Date roleDate) {
        this.roleDate = roleDate;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    public Integer getRoleUser() {
        return roleUser;
    }

    public void setRoleUser(Integer roleUser) {
        this.roleUser = roleUser;
    }
}