package com.example.erp.chenhan.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.erp.chenhan.biz.StockapplyBiz;
import com.example.erp.chenhan.pojo.Stockapply;

@RestController
@RequestMapping("/api/Stockapplys") // 命名空间
public class StockapplyAction {
	
	@Resource
	private StockapplyBiz biz;
	
	@GetMapping("queryAll")
	public List<Stockapply> queryStockapplyAndDeatails(){
		return biz.queryStockapplyAndDeatails();
	}
	
}
