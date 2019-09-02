package com.example.erp.liaoshuanchen.dao;

import com.example.erp.liaoshuanchen.pojo.CurrencyLsc;
import java.util.List;

public interface CurrencyLscMapper {
    int deleteByPrimaryKey(String currencyno);

    int insert(CurrencyLsc record);

    CurrencyLsc selectByPrimaryKey(String currencyno);

    List<CurrencyLsc> selectAll();

    int updateByPrimaryKey(CurrencyLsc record);
}