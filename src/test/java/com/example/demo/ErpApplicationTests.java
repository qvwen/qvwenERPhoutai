package com.example.demo;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.example.erp.quwenjia.biz.UserBiz;

@RunWith(SpringRunner.class)
@SpringBootTest
@SpringBootConfiguration
public class ErpApplicationTests {
   @Resource
	private  UserBiz biz;
	@Test
	public void contextLoads() {
	  System.out.println(JSON.toJSONString(biz.getUser("3209799669", "quwenjia20011021")));
	}

}
