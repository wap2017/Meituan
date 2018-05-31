package com.meituan.mapper;

import com.meituan.pojo.Identification;
import com.meituan.pojo.IdentificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IdentificationMapper {
    int countByExample(IdentificationExample example);

    int deleteByExample(IdentificationExample example);

    int deleteByPrimaryKey(String sId);

    int insert(Identification record);

    int insertSelective(Identification record);

    List<Identification> selectByExample(IdentificationExample example);

    Identification selectByPrimaryKey(String sId);

    int updateByExampleSelective(@Param("record") Identification record, @Param("example") IdentificationExample example);

    int updateByExample(@Param("record") Identification record, @Param("example") IdentificationExample example);

    int updateByPrimaryKeySelective(Identification record);

    int updateByPrimaryKey(Identification record);
}