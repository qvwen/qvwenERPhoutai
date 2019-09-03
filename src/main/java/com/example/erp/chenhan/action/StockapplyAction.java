package com.example.erp.chenhan.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.erp.chenhan.biz.CHStockapplyBiz;
import com.example.erp.chenhan.pojo.CHStockapply;

@RestController
@RequestMapping("/api/Stockapplys") // 命名空间
public class StockapplyAction {
	
	@Resource
	private CHStockapplyBiz biz;
	
	@GetMapping("queryAll")
	public List<CHStockapply> queryStockapplyAndDeatails(){
		return biz.queryStockapplyAndDeatails();
	}
	
}
