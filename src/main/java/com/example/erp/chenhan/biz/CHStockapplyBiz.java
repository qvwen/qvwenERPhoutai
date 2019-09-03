package com.example.erp.chenhan.biz;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.erp.chenhan.dao.CHStockapplyMapper;
import com.example.erp.chenhan.pojo.CHStockapply;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class CHStockapplyBiz {
	
	@Resource
	private CHStockapplyMapper dao;
	
	public List<CHStockapply> queryStockapplyAndDeatails(){
		return dao.queryStockapplyAndDeatails();
	}
	
}
