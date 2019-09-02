package com.example.erp.liaoshuanchen.dao;

import com.example.erp.liaoshuanchen.pojo.SellorderLsc;
import java.util.List;

public interface SellorderLscMapper {
    int deleteByPrimaryKey(String billid);

    int insert(SellorderLsc record);

    SellorderLsc selectByPrimaryKey(String billid);

    List<SellorderLsc> selectAll();

    int updateByPrimaryKey(SellorderLsc record);
}