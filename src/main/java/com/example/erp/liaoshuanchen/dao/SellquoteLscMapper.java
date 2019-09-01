package com.example.erp.liaoshuanchen.dao;

import com.example.erp.liaoshuanchen.pojo.SellquoteLsc;
import java.util.List;

public interface SellquoteLscMapper {
    int deleteByPrimaryKey(String billid);

    int insert(SellquoteLsc record);

    SellquoteLsc selectByPrimaryKey(String billid);

    List<SellquoteLsc> selectAll();

    int updateByPrimaryKey(SellquoteLsc record);
    
    int updateCheckstate(String billid);
}