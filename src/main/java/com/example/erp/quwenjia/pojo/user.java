package com.example.erp.quwenjia.pojo;

import java.io.Serializable;
import java.util.List;

public class user implements Serializable {
    private Integer usersId;

    private String userName;

    private String userAcction;

    private String userPwd;

    private String userImge;

    private  List<role>  roleS;   //角色集合
    

    public List<role> getRoleS() {
		return roleS;
	}

	public void setRoleS(List<role> roleS) {
		this.roleS = roleS;
	}

	public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserAcction() {
        return userAcction;
    }

    public void setUserAcction(String userAcction) {
        this.userAcction = userAcction == null ? null : userAcction.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserImge() {
        return userImge;
    }

    public void setUserImge(String userImge) {
        this.userImge = userImge == null ? null : userImge.trim();
    }
}