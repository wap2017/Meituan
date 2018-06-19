package com.meituan.service.orders;

import java.util.List;

import com.meituan.pojo.Address;
import com.meituan.pojo.Goods;
import com.meituan.pojo.Orderitem;
import com.meituan.pojo.Orders;

public interface OrderService {

	List<Orders> findAllOrders();
	
	//---------------商家----------------------
		int findTodayOrdersCount(String bId);//查今天订单
		int findOrdersCount(String bId);//查总订单
		Double findTodayOrdersMoney(String bId);//查今天营业额
		Double findOrdersMoney(String bId);//查总营业额
		
		List<Orders> findWaitingOrder(String bId);//查待接单的订单
		List<Orders> findProceedOrder(String bId);//查待进行 中的订单
		List<Orders> findCompleteOrder(String bId);//查待已完成的订单
		List<Orders> findCancelOrder(String bId);//查待取消的订单
		
		List<Orderitem> findOrderItem(String oId);//查对应订单的商品详情
		Goods findGoodName(String gId);//查对应gid的商品名
		Address findAddress(String adId);//查收货地址
}
