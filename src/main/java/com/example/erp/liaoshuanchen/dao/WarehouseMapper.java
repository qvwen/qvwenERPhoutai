package com.example.erp.liaoshuanchen.dao;

import com.example.erp.liaoshuanchen.pojo.Warehouse;
import java.util.List;

public interface WarehouseMapper {
    int deleteByPrimaryKey(Integer warehouseId);

    int insert(Warehouse record);

    Warehouse selectByPrimaryKey(Integer warehouseId);

    List<Warehouse> selectAll();

    int updateByPrimaryKey(Warehouse record);
}