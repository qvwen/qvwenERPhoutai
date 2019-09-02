package com.example.erp.liaoshuanchen.dao;

import com.example.erp.liaoshuanchen.pojo.StoragetypeLsc;
import java.util.List;

public interface StoragetypeLscMapper {
    int deleteByPrimaryKey(String storagetypeno);

    int insert(StoragetypeLsc record);

    StoragetypeLsc selectByPrimaryKey(String storagetypeno);

    List<StoragetypeLsc> selectAll();

    int updateByPrimaryKey(StoragetypeLsc record);
}