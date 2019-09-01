package com.example.erp.liaoshuanchen.dao;

import com.example.erp.liaoshuanchen.pojo.PurchaseinvoicelistLsc;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseinvoicelistLscMapper {
    int deleteByPrimaryKey(@Param("purno") String purno, @Param("apdrows") Integer apdrows);

    int insert(PurchaseinvoicelistLsc record);

    PurchaseinvoicelistLsc selectByPrimaryKey(@Param("purno") String purno, @Param("apdrows") Integer apdrows);

    List<PurchaseinvoicelistLsc> selectAll();

    int updateByPrimaryKey(PurchaseinvoicelistLsc record);
}