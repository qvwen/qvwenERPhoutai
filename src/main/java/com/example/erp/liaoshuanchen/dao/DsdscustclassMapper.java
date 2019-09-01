package com.example.erp.liaoshuanchen.dao;

import com.example.erp.liaoshuanchen.pojo.Dsdscustclass;
import java.util.List;

public interface DsdscustclassMapper {
    int deleteByPrimaryKey(String classid);

    int insert(Dsdscustclass record);

    Dsdscustclass selectByPrimaryKey(String classid);

    List<Dsdscustclass> selectAll();

    int updateByPrimaryKey(Dsdscustclass record);
}