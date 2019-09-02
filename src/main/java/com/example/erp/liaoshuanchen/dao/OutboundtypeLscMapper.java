package com.example.erp.liaoshuanchen.dao;

import com.example.erp.liaoshuanchen.pojo.OutboundtypeLsc;
import java.util.List;

public interface OutboundtypeLscMapper {
    int deleteByPrimaryKey(String outboundtypeno);

    int insert(OutboundtypeLsc record);

    OutboundtypeLsc selectByPrimaryKey(String outboundtypeno);

    List<OutboundtypeLsc> selectAll();

    int updateByPrimaryKey(OutboundtypeLsc record);
}