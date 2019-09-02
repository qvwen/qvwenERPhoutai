package com.example.erp.liaoshuanchen.dao;

import com.example.erp.liaoshuanchen.pojo.Personnel;
import java.util.List;

public interface PersonnelMapper {
    int deleteByPrimaryKey(Integer personnelId);

    int insert(Personnel record);

    Personnel selectByPrimaryKey(Integer personnelId);

    List<Personnel> selectAll();

    int updateByPrimaryKey(Personnel record);
}