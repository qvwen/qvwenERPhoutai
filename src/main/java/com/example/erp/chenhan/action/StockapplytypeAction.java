package com.example.erp.chenhan.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.erp.chenhan.biz.StockapplytypeBiz;
import com.example.erp.chenhan.pojo.Stockapplytype;

@RestController
@RequestMapping("/api/StockapplyTypes") // 命名空间
public class StockapplytypeAction {

	@Resource
	private StockapplytypeBiz biz;
	
	@GetMapping("{id}/{name}")
	public List<Stockapplytype> selectAll(@PathVariable Integer id, @PathVariable String name){
		return biz.selectAll(id, name);
	}
	
}
