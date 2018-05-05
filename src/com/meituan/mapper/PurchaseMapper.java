package com.meituan.mapper;

import com.meituan.pojo.Purchase;
import com.meituan.pojo.PurchaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseMapper {
    int countByExample(PurchaseExample example);

    int deleteByExample(PurchaseExample example);

    int deleteByPrimaryKey(String pId);

    int insert(Purchase record);

    int insertSelective(Purchase record);

    List<Purchase> selectByExample(PurchaseExample example);

    Purchase selectByPrimaryKey(String pId);

    int updateByExampleSelective(@Param("record") Purchase record, @Param("example") PurchaseExample example);

    int updateByExample(@Param("record") Purchase record, @Param("example") PurchaseExample example);

    int updateByPrimaryKeySelective(Purchase record);

    int updateByPrimaryKey(Purchase record);
}