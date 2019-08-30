package com.example.erp.quwenjia.pojo;

import java.io.Serializable;
import java.util.Date;

public class RoleandUser implements Serializable {
    private Integer id;

    private Integer usersId;

    private Integer rolesId;

    private Integer andUser;

    private Date andDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public Integer getRolesId() {
        return rolesId;
    }

    public void setRolesId(Integer rolesId) {
        this.rolesId = rolesId;
    }

    public Integer getAndUser() {
        return andUser;
    }

    public void setAndUser(Integer andUser) {
        this.andUser = andUser;
    }

    public Date getAndDate() {
        return andDate;
    }

    public void setAndDate(Date andDate) {
        this.andDate = andDate;
    }
}