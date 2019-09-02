package com.example.erp.quwenjia.action;

import java.util.Set;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.erp.quwenjia.biz.UserBiz;
import com.example.erp.quwenjia.pojo.user;

@RestController
@RequestMapping("/quwenjia/user")
public class UaerAcction {
	
	@Resource
    private UserBiz biz;
	
	@GetMapping("/user")
	public user  getUser() {
		return biz.getUser("admin", "202cb962ac59075b964b07152d234b70");
	}
}
