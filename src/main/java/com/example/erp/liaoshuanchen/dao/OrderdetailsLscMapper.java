package com.example.erp.liaoshuanchen.dao;

import com.example.erp.liaoshuanchen.pojo.OrderdetailsLsc;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderdetailsLscMapper {
    int deleteByPrimaryKey(@Param("billid") String billid, @Param("cotemark") String cotemark);

    int insert(OrderdetailsLsc record);

    OrderdetailsLsc selectByPrimaryKey(@Param("billid") String billid, @Param("cotemark") String cotemark);

    List<OrderdetailsLsc> selectAll();

    int updateByPrimaryKey(OrderdetailsLsc record);
}