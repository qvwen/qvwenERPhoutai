package com.example.erp.liaoshuanchen.dao;

import com.example.erp.liaoshuanchen.pojo.OtheroutmainLsc;
import java.util.List;

public interface OtheroutmainLscMapper {
    int deleteByPrimaryKey(String othid);

    int insert(OtheroutmainLsc record);

    OtheroutmainLsc selectByPrimaryKey(String othid);

    List<OtheroutmainLsc> selectAll();

    int updateByPrimaryKey(OtheroutmainLsc record);
}