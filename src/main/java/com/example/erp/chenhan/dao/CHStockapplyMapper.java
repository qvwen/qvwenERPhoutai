package com.example.erp.chenhan.dao;

import java.util.List;

import com.example.erp.chenhan.pojo.CHStockapply;

public interface CHStockapplyMapper {
//    int deleteByPrimaryKey(String billno);
//
//    int insert(Stockapply record);
//
//    Stockapply selectByPrimaryKey(String billno);
//
//    List<Stockapply> selectAll();
//
//    int updateByPrimaryKey(Stockapply record);
    
    List<CHStockapply> queryStockapplyAndDeatails();
}