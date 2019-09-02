package com.example.erp.liaoshuanchen.dao;

import com.example.erp.liaoshuanchen.pojo.Dsdatasat1;
import java.util.List;

public interface Dsdatasat1Mapper {
    int deleteByPrimaryKey(String id);

    int insert(Dsdatasat1 record);

    Dsdatasat1 selectByPrimaryKey(String id);

    List<Dsdatasat1> selectAll();

    int updateByPrimaryKey(Dsdatasat1 record);
}