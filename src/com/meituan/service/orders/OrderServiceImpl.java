package com.meituan.service.orders;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meituan.mapper.AddressMapper;
import com.meituan.mapper.GoodsMapper;
import com.meituan.mapper.OrderitemMapper;
import com.meituan.mapper.OrdersMapper;
import com.meituan.pojo.Address;
import com.meituan.pojo.Goods;
import com.meituan.pojo.Orderitem;
import com.meituan.pojo.OrderitemExample;
import com.meituan.pojo.Orders;
import com.meituan.pojo.OrdersExample;
import com.meituan.pojo.OrdersExample.Criteria;

@Service("OrderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrdersMapper orderMapper;
	@Autowired
	private OrderitemMapper orderitemMapper;
	@Autowired
	private GoodsMapper goodsMapper;
	@Autowired
	private AddressMapper addressMapper;

	@Override
	public List<Orders> findAllOrders() {
		OrdersExample order=new OrdersExample();
		return  orderMapper.selectByExample(order);
	}
	
	
	//---------------------商家----------------------------------
	@Override
	public int findTodayOrdersCount(String bId) {
		OrdersExample example = new OrdersExample();
		Criteria cr = example.createCriteria();
		cr.andBIdEqualTo(bId);
		cr.andOPaymentstateNotEqualTo("已取消");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
		Date date = new Date();
		String str = sdf.format(date);
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date1;
		Date date2;
		try {
			date1 = sdf.parse(str+" 00:00:00");
			date2 = sdf.parse(str+" 23:59:59");
		cr.andOOpentimeBetween(date1, date2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return orderMapper.countByExample(example);
	}


	@Override
	public int findOrdersCount(String bId) {
		OrdersExample example = new OrdersExample();
		Criteria cr = example.createCriteria();
		cr.andBIdEqualTo(bId);
		cr.andOPaymentstateNotEqualTo("已取消");
		return orderMapper.countByExample(example);
	}


	@Override
	public Double findTodayOrdersMoney(String bId) {
		OrdersExample example = new OrdersExample();
		Criteria cr = example.createCriteria();
		cr.andBIdEqualTo(bId);
		cr.andOPaymentstateNotEqualTo("已取消");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
		Date date = new Date();
		String str = sdf.format(date);
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date1;
		Date date2;
		try {
			date1 = sdf.parse(str+" 00:00:00");
			date2 = sdf.parse(str+" 23:59:59");
		cr.andOOpentimeBetween(date1, date2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return orderMapper.sumOrdersMoney(example);
	}


	@Override
	public Double findOrdersMoney(String bId) {
		OrdersExample example = new OrdersExample();
		Criteria cr = example.createCriteria();
		cr.andBIdEqualTo(bId);
		cr.andOPaymentstateNotEqualTo("已取消");
		return orderMapper.sumOrdersMoney(example);
	}


	@Override
	public List<Orders> findWaitingOrder(String bId) {
		OrdersExample example = new OrdersExample();
		Criteria cr = example.createCriteria();
		cr.andBIdEqualTo(bId);
		cr.andOPaymentstateEqualTo("待接单");
		return orderMapper.selectByExample(example);
	}


	@Override
	public List<Orders> findProceedOrder(String bId) {
		OrdersExample example = new OrdersExample();
		Criteria cr = example.createCriteria();
		cr.andBIdEqualTo(bId);
		cr.andOPaymentstateEqualTo("进行中");
		return orderMapper.selectByExample(example);
	}


	@Override
	public List<Orders> findCompleteOrder(String bId) {
		OrdersExample example = new OrdersExample();
		Criteria cr = example.createCriteria();
		cr.andBIdEqualTo(bId);
		cr.andOPaymentstateEqualTo("已完成");
		return orderMapper.selectByExample(example);
	}


	@Override
	public List<Orders> findCancelOrder(String bId) {
		OrdersExample example = new OrdersExample();
		Criteria cr = example.createCriteria();
		cr.andBIdEqualTo(bId);
		cr.andOPaymentstateEqualTo("已取消");
		return orderMapper.selectByExample(example);
	}
	@Override
	public List<Orders> findAllOrder(String bId) {
		OrdersExample example = new OrdersExample();
		Criteria cr = example.createCriteria();
		cr.andBIdEqualTo(bId);
		return orderMapper.selectByExample(example);
	}

	@Override
	public List<Orderitem> findOrderItem(String oId) {
		OrderitemExample example = new OrderitemExample();
		OrderitemExample.Criteria cr = example.createCriteria();
		cr.andOIdEqualTo(oId);
		return orderitemMapper.selectByExample(example);
	}


	@Override
	public Goods findGoodName(String gId) {
		
		return goodsMapper.selectByPrimaryKey(gId);
	}


	@Override
	public Address findAddress(String adId) {
		return addressMapper.selectByPrimaryKey(adId);
	}


	@Override
	public int updateByPrimaryKeySelective(Orders record) {
		return orderMapper.updateByPrimaryKeySelective(record);
	}


	@Override
	public int updateByPrimaryKeySelective(Goods record) {
		return goodsMapper.updateByPrimaryKeySelective(record);
	}


	@Override
	public int deleteByPrimaryKey(String gId) {
		return goodsMapper.deleteByPrimaryKey(gId);
	}


	
}
