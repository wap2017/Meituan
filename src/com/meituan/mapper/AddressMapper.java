package com.meituan.mapper;

import com.meituan.pojo.Address;
import com.meituan.pojo.AddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddressMapper {
    int countByExample(AddressExample example);

    int deleteByExample(AddressExample example);

    int deleteByPrimaryKey(String adId);

    int insert(Address record);

    int insertSelective(Address record);

    List<Address> selectByExample(AddressExample example);

    Address selectByPrimaryKey(String adId);

    int updateByExampleSelective(@Param("record") Address record, @Param("example") AddressExample example);

    int updateByExample(@Param("record") Address record, @Param("example") AddressExample example);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);
}