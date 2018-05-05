package com.meituan.mapper;

import com.meituan.pojo.OrderItem;
import com.meituan.pojo.OrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderItemMapper {
    int countByExample(OrderItemExample example);

    int deleteByExample(OrderItemExample example);

    int deleteByPrimaryKey(String oId);

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    List<OrderItem> selectByExample(OrderItemExample example);

    OrderItem selectByPrimaryKey(String oId);

    int updateByExampleSelective(@Param("record") OrderItem record, @Param("example") OrderItemExample example);

    int updateByExample(@Param("record") OrderItem record, @Param("example") OrderItemExample example);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);
}