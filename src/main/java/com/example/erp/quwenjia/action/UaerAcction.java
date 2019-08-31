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
		return biz.getUser("3209799669", "quwenjia20011021");
	}
}
