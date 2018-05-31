package com.meituan.mapper;

import com.meituan.pojo.Remainingsum;
import com.meituan.pojo.RemainingsumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RemainingsumMapper {
    int countByExample(RemainingsumExample example);

    int deleteByExample(RemainingsumExample example);

    int deleteByPrimaryKey(String rsId);

    int insert(Remainingsum record);

    int insertSelective(Remainingsum record);

    List<Remainingsum> selectByExample(RemainingsumExample example);

    Remainingsum selectByPrimaryKey(String rsId);

    int updateByExampleSelective(@Param("record") Remainingsum record, @Param("example") RemainingsumExample example);

    int updateByExample(@Param("record") Remainingsum record, @Param("example") RemainingsumExample example);

    int updateByPrimaryKeySelective(Remainingsum record);

    int updateByPrimaryKey(Remainingsum record);
}