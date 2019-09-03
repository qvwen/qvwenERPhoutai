package com.example.erp.chenhan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.erp.chenhan.pojo.CHStockapplytype;

public interface CHStockapplytypeMapper {
    int deleteByPrimaryKey(String classid);

    int insert(CHStockapplytype record);

    CHStockapplytype selectByPrimaryKey(String classid);

    List<CHStockapplytype> selectAll(@Param("id") Integer id,@Param("name") String name);

    int updateByPrimaryKey(CHStockapplytype record);
}