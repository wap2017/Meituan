package com.meituan.mapper;

import com.meituan.pojo.Bussiness;
import com.meituan.pojo.BussinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BussinessMapper {
    int countByExample(BussinessExample example);

    int deleteByExample(BussinessExample example);

    int deleteByPrimaryKey(String bId);

    int insert(Bussiness record);

    int insertSelective(Bussiness record);

    List<Bussiness> selectByExample(BussinessExample example);

    Bussiness selectByPrimaryKey(String bId);

    int updateByExampleSelective(@Param("record") Bussiness record, @Param("example") BussinessExample example);

    int updateByExample(@Param("record") Bussiness record, @Param("example") BussinessExample example);

    int updateByPrimaryKeySelective(Bussiness record);

    int updateByPrimaryKey(Bussiness record);
}