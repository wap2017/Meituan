package com.meituan.service.orders;

import java.util.List;


import com.meituan.pojo.Orders;

public interface OrderService {

	List<Orders> findAllOrders();

}
