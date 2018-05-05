package com.meituan.mapper;

import com.meituan.pojo.Shoptype;
import com.meituan.pojo.ShoptypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoptypeMapper {
    int countByExample(ShoptypeExample example);

    int deleteByExample(ShoptypeExample example);

    int deleteByPrimaryKey(String shoptypeId);

    int insert(Shoptype record);

    int insertSelective(Shoptype record);

    List<Shoptype> selectByExample(ShoptypeExample example);

    Shoptype selectByPrimaryKey(String shoptypeId);

    int updateByExampleSelective(@Param("record") Shoptype record, @Param("example") ShoptypeExample example);

    int updateByExample(@Param("record") Shoptype record, @Param("example") ShoptypeExample example);

    int updateByPrimaryKeySelective(Shoptype record);

    int updateByPrimaryKey(Shoptype record);
}