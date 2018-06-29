package com.example.erp.chenhan.biz;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.erp.chenhan.dao.StockapplyMapper;
import com.example.erp.chenhan.pojo.Stockapply;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class StockapplyBiz {
	
	@Resource
	private StockapplyMapper dao;
	
	public List<Stockapply> queryStockapplyAndDeatails(){
		return dao.queryStockapplyAndDeatails();
	}
	
}
