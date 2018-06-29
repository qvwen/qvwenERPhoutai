package com.example.erp.chenhan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.erp.chenhan.pojo.Stockapplytype;

public interface StockapplytypeMapper {
    int deleteByPrimaryKey(String classid);

    int insert(Stockapplytype record);

    Stockapplytype selectByPrimaryKey(String classid);

    List<Stockapplytype> selectAll(@Param("id") Integer id,@Param("name") String name);

    int updateByPrimaryKey(Stockapplytype record);
}