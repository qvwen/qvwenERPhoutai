package com.example.erp.liaoshuanchen.dao;

import com.example.erp.liaoshuanchen.pojo.ClearingformtypeLsc;
import java.util.List;

public interface ClearingformtypeLscMapper {
    int deleteByPrimaryKey(String cleno);

    int insert(ClearingformtypeLsc record);

    ClearingformtypeLsc selectByPrimaryKey(String cleno);

    List<ClearingformtypeLsc> selectAll();

    int updateByPrimaryKey(ClearingformtypeLsc record);
}