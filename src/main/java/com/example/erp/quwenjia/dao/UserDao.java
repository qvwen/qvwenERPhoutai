package com.example.erp.quwenjia.dao;

import org.apache.ibatis.annotations.Param;

import com.example.erp.quwenjia.pojo.user;

public interface UserDao {
    public user getuser(@Param("ac")String ac,@Param("pws")String pws);
}
