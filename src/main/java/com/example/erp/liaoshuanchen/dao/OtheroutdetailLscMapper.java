package com.example.erp.liaoshuanchen.dao;

import com.example.erp.liaoshuanchen.pojo.OtheroutdetailLsc;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OtheroutdetailLscMapper {
    int deleteByPrimaryKey(@Param("otheroutid") String otheroutid, @Param("othoutlineno") Integer othoutlineno);

    int insert(OtheroutdetailLsc record);

    OtheroutdetailLsc selectByPrimaryKey(@Param("otheroutid") String otheroutid, @Param("othoutlineno") Integer othoutlineno);

    List<OtheroutdetailLsc> selectAll();

    int updateByPrimaryKey(OtheroutdetailLsc record);
}