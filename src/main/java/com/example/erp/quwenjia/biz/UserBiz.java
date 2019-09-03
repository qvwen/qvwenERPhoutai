package com.example.erp.quwenjia.biz;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.erp.quwenjia.dao.UserDao;

import com.example.erp.quwenjia.pojo.user;
@Service
public class UserBiz {
	@Resource
   private UserDao userBizs;
	
	public   user  getUser(String ac,String pws) {
		return userBizs.getuser(ac, pws);
	}
}
