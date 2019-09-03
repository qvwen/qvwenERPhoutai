package com.example.erp.liaoshuanchen.dao;

import com.example.erp.liaoshuanchen.pojo.Dsdscust1;
import java.util.List;

public interface Dsdscust1Mapper {
    int deleteByPrimaryKey(String id);

    int insert(Dsdscust1 record);

    Dsdscust1 selectByPrimaryKey(String id);

    List<Dsdscust1> selectAll();

    int updateByPrimaryKey(Dsdscust1 record);
}