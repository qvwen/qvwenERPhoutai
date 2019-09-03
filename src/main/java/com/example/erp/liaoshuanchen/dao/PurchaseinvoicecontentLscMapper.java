package com.example.erp.liaoshuanchen.dao;

import com.example.erp.liaoshuanchen.pojo.PurchaseinvoicecontentLsc;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseinvoicecontentLscMapper {
    int deleteByPrimaryKey(@Param("purno") String purno, @Param("apdrows") String apdrows);

    int insert(PurchaseinvoicecontentLsc record);

    PurchaseinvoicecontentLsc selectByPrimaryKey(@Param("purno") String purno, @Param("apdrows") String apdrows);

    List<PurchaseinvoicecontentLsc> selectAll();

    int updateByPrimaryKey(PurchaseinvoicecontentLsc record);
}