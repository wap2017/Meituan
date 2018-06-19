package com.meituan.service.orders;

import java.util.List;

import com.meituan.pojo.Address;
import com.meituan.pojo.Goods;
import com.meituan.pojo.Orderitem;
import com.meituan.pojo.Orders;

public interface OrderService {

	List<Orders> findAllOrders();
	
	//---------------�̼�----------------------
		int findTodayOrdersCount(String bId);//����충��
		int findOrdersCount(String bId);//���ܶ���
		Double findTodayOrdersMoney(String bId);//�����Ӫҵ��
		Double findOrdersMoney(String bId);//����Ӫҵ��
		
		List<Orders> findWaitingOrder(String bId);//����ӵ��Ķ���
		List<Orders> findProceedOrder(String bId);//������� �еĶ���
		List<Orders> findCompleteOrder(String bId);//�������ɵĶ���
		List<Orders> findCancelOrder(String bId);//���ȡ���Ķ���
		
		List<Orderitem> findOrderItem(String oId);//���Ӧ��������Ʒ����
		Goods findGoodName(String gId);//���Ӧgid����Ʒ��
		Address findAddress(String adId);//���ջ���ַ
}
