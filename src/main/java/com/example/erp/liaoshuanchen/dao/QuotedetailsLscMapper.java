package com.example.erp.liaoshuanchen.dao;

import com.example.erp.liaoshuanchen.pojo.QuotedetailsLsc;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuotedetailsLscMapper {
    int deleteByPrimaryKey(@Param("billid") String billid, @Param("cotemark") String cotemark);

    int insert(QuotedetailsLsc record);

    QuotedetailsLsc selectByPrimaryKey(@Param("billid") String billid, @Param("cotemark") String cotemark);

    List<QuotedetailsLsc> selectAll();

    int updateByPrimaryKey(QuotedetailsLsc record);
}