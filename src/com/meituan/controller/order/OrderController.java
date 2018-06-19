package com.meituan.controller.order;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.meituan.pojo.Address;
import com.meituan.pojo.Goods;
import com.meituan.pojo.OrderWGoodName;
import com.meituan.pojo.Orderitem;
import com.meituan.pojo.Orders;
import com.meituan.service.orders.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {

	@Resource(name = "OrderService")
	private OrderService orderService;
	
	/**
	 * �ҵ����еĶ�����¼��һ�η��أ���ǰ�˽��з�ҳ
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/findAll")
	@ResponseBody
	public List<Orders> findAllOrders(Model model) {
		List<Orders> result = orderService.findAllOrders();
		return result;
	}
//-------------�̼�--------------------------
	
	/**
	 * ���Ӧ�̼ҵĽ��ն�����,�ܶ�����
	 * @param model
	 * @param uId
	 * @return
	 */
	@RequestMapping("/findOrdersCount")
	@ResponseBody
	public List<Integer> findOrdersCount(Model model,String bId){
		int orderNum = orderService.findOrdersCount(bId);
		int todayOrderNum = orderService.findTodayOrdersCount(bId);
		List<Integer> num = new ArrayList<>();
		num.add(orderNum);
		num.add(todayOrderNum);
		System.out.println(orderNum);
		return num;
	}
	
	/**
	 * ���Ӧ�̼ҵĽ���Ӫҵ��,��Ӫҵ��
	 * @param model
	 * @param uId
	 * @return
	 */
	@RequestMapping("/findOrdersMoney")
	@ResponseBody
	public List<Double> findOrdersMoney(Model model,String bId){
		Double ordersMoney = orderService.findOrdersMoney(bId);
		Double todayOrdersMoney = orderService.findTodayOrdersMoney(bId);
		List<Double> money = new ArrayList<>();
		money.add(ordersMoney);
		money.add(todayOrdersMoney);
		return money;
	}

	/**
	 * ���Ҷ�Ӧ�̼Ҵ��ӵ��Ķ���
	 * @param model
	 * @param bId
	 * @return
	 */
	@RequestMapping("/findWaitingOrder")
	@ResponseBody
	public List<OrderWGoodName> findWaitingOrder(Model model){
		List<Orders> orders = orderService.findWaitingOrder("b1");
		List<OrderWGoodName> list = findOrder(orders);
		return list;
	}
	/**
	 * ���Ҷ�Ӧ�̼ҽ����еĶ���
	 * @param model
	 * @param bId
	 * @return
	 */
	@RequestMapping("/findProceedOrder")
	@ResponseBody
	public List<OrderWGoodName> findProceedOrder(Model model){
		List<Orders> orders = orderService.findProceedOrder("b1");
		List<OrderWGoodName> list = findOrder(orders);
		return list;
	}
	/**
	 * ���Ҷ�Ӧ�̼�����ɵĶ���
	 * @param model
	 * @param bId
	 * @return
	 */
	@RequestMapping("/findCompleteOrder")
	@ResponseBody
	public List<OrderWGoodName> findCompleteOrder(Model model){
		List<Orders> orders = orderService.findCompleteOrder("b1");
		List<OrderWGoodName> list = findOrder(orders);
		return list;
	}
	/**
	 * ���Ҷ�Ӧ�̼���ȡ���Ķ���
	 * @param model
	 * @param bId
	 * @return
	 */
	@RequestMapping("/findCancelOrder")
	@ResponseBody
	public List<OrderWGoodName> findCancelOrder(Model model){
		List<Orders> orders = orderService.findCancelOrder("b1");
		List<OrderWGoodName> list = findOrder(orders);
		return list;
	}
	//���Ҷ�Ӧ�Ķ����ж�Ӧ���ջ���ַ����Ӧ����Ʒ����
	private  List<OrderWGoodName> findOrder(List<Orders> orders){
		if(orders!=null){
		List<OrderWGoodName> list = new ArrayList<>();
		for (Orders orders2 : orders) {
			OrderWGoodName owgn = new OrderWGoodName();
			List<Orderitem> orderItem = orderService.findOrderItem(orders2.getoId());
			Map<String, Integer> good = new HashMap<>();
			if(orderItem!=null){
				for (Orderitem orderitem2 : orderItem) {
					Goods g = orderService.findGoodName(orderitem2.getgId());
					if(g!=null){
					good.put(g.getgName(), orderitem2.getoNum());
					}else{
						good.put("0", 0);
					}
					owgn.setGoods(good);
				}
			}else{
				owgn.setGoods(null);
			}
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
			String str = sdf.format(orders2.getoOpentime());
			try {
				orders2.setoOpentime(sdf.parse(str));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			owgn.setOrders(orders2);
			Address addr = orderService.findAddress(orders2.getAdEndid());
			if(addr.getAdProvince()==null){
				addr.setAdProvince("");
			}
			owgn.setAddress(addr);
			list.add(owgn);
		}
		return list;
		}else{
		return null;
		}
	}
}