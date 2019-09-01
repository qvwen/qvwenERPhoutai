package com.example.erp.liaoshuanchen.dao;

import com.example.erp.liaoshuanchen.pojo.OthercomedetailLsc;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OthercomedetailLscMapper {
    int deleteByPrimaryKey(@Param("othcomeid") String othcomeid, @Param("othcomeno") Integer othcomeno);

    int insert(OthercomedetailLsc record);

    OthercomedetailLsc selectByPrimaryKey(@Param("othcomeid") String othcomeid, @Param("othcomeno") Integer othcomeno);

    List<OthercomedetailLsc> selectAll();

    int updateByPrimaryKey(OthercomedetailLsc record);
}