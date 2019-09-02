package com.example.erp.liaoshuanchen.dao;

import com.example.erp.liaoshuanchen.pojo.PurchaseinvoiceLsc;
import java.util.List;

public interface PurchaseinvoiceLscMapper {
    int deleteByPrimaryKey(String billid);

    int insert(PurchaseinvoiceLsc record);

    PurchaseinvoiceLsc selectByPrimaryKey(String billid);

    List<PurchaseinvoiceLsc> selectAll();

    int updateByPrimaryKey(PurchaseinvoiceLsc record);
}