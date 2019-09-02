<<<<<<< HEAD
package com.example.demo;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.erp.wenwei.biz.AllotBiz;
 

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class test {
	@Autowired
	private AllotBiz biz;

	@Test
	public void contextLoads() {
		System.out.println(biz.addDetail("", "", "", "", ""));
	}
}
=======
package com.example.demo;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.erp.wenwei.biz.AllotBiz;
 

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class test {
	@Autowired
	private AllotBiz biz;

	@Test
	public void contextLoads() {
		System.out.println(biz.addDetail("", "", "", "", ""));
	}
}
>>>>>>> parent of feee0d9... s
