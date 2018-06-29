package com.example.erp.liaoshuanchen.dao;

import com.example.erp.liaoshuanchen.pojo.InvoicetypeLsc;
import java.util.List;

public interface InvoicetypeLscMapper {
    int deleteByPrimaryKey(String invno);

    int insert(InvoicetypeLsc record);

    InvoicetypeLsc selectByPrimaryKey(String invno);

    List<InvoicetypeLsc> selectAll();

    int updateByPrimaryKey(InvoicetypeLsc record);
}