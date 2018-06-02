package com.meituan.service.orders;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.meituan.mapper.OrdersMapper;
import com.meituan.pojo.Orders;
import com.meituan.pojo.OrdersExample;

@Service("OrderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrdersMapper orderMapper;


	@Override
	public List<Orders> findAllOrders() {
		OrdersExample order=new OrdersExample();
		return  orderMapper.selectByExample(order);
	}

}
