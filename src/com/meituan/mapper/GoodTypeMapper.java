package com.meituan.mapper;

import com.meituan.pojo.GoodType;
import com.meituan.pojo.GoodTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodTypeMapper {
    int countByExample(GoodTypeExample example);

    int deleteByExample(GoodTypeExample example);

    int insert(GoodType record);

    int insertSelective(GoodType record);

    List<GoodType> selectByExample(GoodTypeExample example);

    int updateByExampleSelective(@Param("record") GoodType record, @Param("example") GoodTypeExample example);

    int updateByExample(@Param("record") GoodType record, @Param("example") GoodTypeExample example);
}