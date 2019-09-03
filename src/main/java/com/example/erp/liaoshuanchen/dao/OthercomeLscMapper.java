package com.example.erp.liaoshuanchen.dao;

import com.example.erp.liaoshuanchen.pojo.OthercomeLsc;
import java.util.List;

public interface OthercomeLscMapper {
    int deleteByPrimaryKey(String othcomeid);

    int insert(OthercomeLsc record);

    OthercomeLsc selectByPrimaryKey(String othcomeid);

    List<OthercomeLsc> selectAll();

    int updateByPrimaryKey(OthercomeLsc record);
}