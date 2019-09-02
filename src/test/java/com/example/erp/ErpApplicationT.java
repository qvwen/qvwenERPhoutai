package com.example.erp;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.example.erp.liaoshuanchen.biz.AllBiz;
import com.example.erp.quwenjia.biz.UserBiz;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ErpApplicationT {
   @Resource
	private  AllBiz biz;
	@Test
	public void contextLoads() {
		biz.findSaleByPage(2);
	}

}
