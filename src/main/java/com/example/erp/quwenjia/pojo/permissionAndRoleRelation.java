package com.example.erp.quwenjia.pojo;

import java.io.Serializable;

public class permissionAndRoleRelation implements Serializable {
    private Integer prid;

    private Integer permissionid;

    private Integer roleid;

 

    public Integer getPrid() {
        return prid;
    }

    public void setPrid(Integer prid) {
        this.prid = prid;
    }

    public Integer getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(Integer permissionid) {
        this.permissionid = permissionid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
}