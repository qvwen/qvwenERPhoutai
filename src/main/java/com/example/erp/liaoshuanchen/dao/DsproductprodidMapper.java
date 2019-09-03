package com.example.erp.liaoshuanchen.dao;

import com.example.erp.liaoshuanchen.pojo.Dsproductprodid;
import java.util.List;

public interface DsproductprodidMapper {
    int deleteByPrimaryKey(String prodid);

    int insert(Dsproductprodid record);

    Dsproductprodid selectByPrimaryKey(String prodid);

    List<Dsproductprodid> selectAll();

    int updateByPrimaryKey(Dsproductprodid record);
}