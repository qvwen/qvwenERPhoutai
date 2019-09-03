package com.example.erp.chenhan.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.erp.chenhan.biz.CHStockapplytypeBiz;
import com.example.erp.chenhan.pojo.CHStockapplytype;

@RestController
@RequestMapping("/api/StockapplyTypes") // 命名空间
public class StockapplytypeAction {

	@Resource
	private CHStockapplytypeBiz biz;
	
	@GetMapping("{id}/{name}")
	public List<CHStockapplytype> selectAll(@PathVariable Integer id, @PathVariable String name){
		return biz.selectAll(id, name);
	}
	
}
