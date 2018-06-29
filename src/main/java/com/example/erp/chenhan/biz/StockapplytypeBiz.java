package com.example.erp.chenhan.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.erp.chenhan.dao.StockapplytypeMapper;
import com.example.erp.chenhan.pojo.Stockapplytype;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class StockapplytypeBiz {
	
	@Resource
	private StockapplytypeMapper dao;
	
	public List<Stockapplytype> selectAll(Integer id, String name){
		return dao.selectAll(id, name);
	}

}
