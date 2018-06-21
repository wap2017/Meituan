package com.meituan.controller.order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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
	 * 找到所有的订单记录，一次返回，由前端进行分页
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
	// -------------商家--------------------------

	/**
	 * 查对应商家的今日订单数,总订单数
	 * 
	 * @param model
	 * @param uId
	 * @return
	 */
	@RequestMapping("/findOrdersCount")
	@ResponseBody
	public List<Integer> findOrdersCount(Model model, HttpServletRequest request) {
		String bId = (String) request.getSession().getAttribute("businessName");
		int orderNum = orderService.findOrdersCount(bId);
		int todayOrderNum = orderService.findTodayOrdersCount(bId);
		List<Integer> num = new ArrayList<>();
		num.add(orderNum);
		num.add(todayOrderNum);
		System.out.println(orderNum);
		return num;
	}

	/**
	 * 查对应商家的今日营业额,总营业额
	 * 
	 * @param model
	 * @param uId
	 * @return
	 */
	@RequestMapping("/findOrdersMoney")
	@ResponseBody
	public List<Double> findOrdersMoney(Model model, HttpServletRequest request) {
		String bId = (String) request.getSession().getAttribute("businessName");
		Double ordersMoney = orderService.findOrdersMoney(bId);
		Double todayOrdersMoney = orderService.findTodayOrdersMoney(bId);
		List<Double> money = new ArrayList<>();
		money.add(ordersMoney);
		money.add(todayOrdersMoney);
		return money;
	}

	/**
	 * 查找对应商家待接单的订单
	 * 
	 * @param model
	 * @param bId
	 * @return
	 */
	@RequestMapping("/findWaitingOrder")
	@ResponseBody
	public List<OrderWGoodName> findWaitingOrder(Model model, HttpServletRequest request) {
		String bId = (String) request.getSession().getAttribute("businessName");
		List<Orders> orders = orderService.findWaitingOrder(bId);
		List<OrderWGoodName> list = findOrder(orders);
		return list;
	}

	/**
	 * 查找对应商家进行中的订单
	 * 
	 * @param model
	 * @param bId
	 * @return
	 */
	@RequestMapping("/findProceedOrder")
	@ResponseBody
	public List<OrderWGoodName> findProceedOrder(Model model, HttpServletRequest request) {
		String bId = (String) request.getSession().getAttribute("businessName");
		List<Orders> orders = orderService.findProceedOrder(bId);
		List<OrderWGoodName> list = findOrder(orders);
		return list;
	}

	/**
	 * 查找对应商家已完成的订单
	 * 
	 * @param model
	 * @param bId
	 * @return
	 */
	@RequestMapping("/findCompleteOrder")
	@ResponseBody
	public List<OrderWGoodName> findCompleteOrder(Model model, HttpServletRequest request) {
		String bId = (String) request.getSession().getAttribute("businessName");
		List<Orders> orders = orderService.findCompleteOrder(bId);
		List<OrderWGoodName> list = findOrder(orders);
		return list;
	}

	/**
	 * 查找对应商家已取消的订单
	 * 
	 * @param model
	 * @param bId
	 * @return
	 */
	@RequestMapping("/findCancelOrder")
	@ResponseBody
	public List<OrderWGoodName> findCancelOrder(Model model, HttpServletRequest request) {
		String bId = (String) request.getSession().getAttribute("businessName");
		List<Orders> orders = orderService.findCancelOrder(bId);
		List<OrderWGoodName> list = findOrder(orders);
		return list;
	}

	/**
	 * 查找所有订单
	 * 
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping("/findAllOrder")
	@ResponseBody
	public List<OrderWGoodName> findAllOrder(Model model, HttpServletRequest request) {
		String bId = (String) request.getSession().getAttribute("businessName");
		List<Orders> orders = orderService.findAllOrder(bId);
		List<OrderWGoodName> list = findOrder(orders);
		return list;
	}

	// 查找对应的订单中对应的收货地址及对应的商品详情
	private List<OrderWGoodName> findOrder(List<Orders> orders) {
		if (orders != null) {
			List<OrderWGoodName> list = new ArrayList<>();
			for (Orders orders2 : orders) {
				OrderWGoodName owgn = new OrderWGoodName();
				List<Orderitem> orderItem = orderService.findOrderItem(orders2.getoId());
				Map<String, Integer> good = new HashMap<>();
				if (orderItem != null) {
					for (Orderitem orderitem2 : orderItem) {
						Goods g = orderService.findGoodName(orderitem2.getgId());
						if (g != null) {
							good.put(g.getgName(), orderitem2.getoNum());
						} else {
							good.put("0", 0);
						}
						owgn.setGoods(good);
					}
				} else {
					owgn.setGoods(null);
				}
				owgn.setOrders(orders2);
				Address addr = orderService.findAddress(orders2.getAdEndid());
				if (addr.getAdProvince() == null) {
					addr.setAdProvince("");
				}
				owgn.setAddress(addr);
				list.add(owgn);
			}
			return list;
		} else {
			return null;
		}
	}

	/**
	 * 单个商品接单
	 * 
	 * @param model
	 * @param oId
	 * @return
	 */
	@RequestMapping("/pick")
	public String pick(Model model, String oId) {
		Orders o = new Orders();
		o.setoId(oId);
		o.setoPaymentstate("进行中");
		orderService.updateByPrimaryKeySelective(o);
		return "redirect:/business/waitingOrder.jsp";
	}

	/**
	 * 单个商品不接单
	 * 
	 * @param model
	 * @param oId
	 * @return
	 */
	@RequestMapping("/notPick")
	public String notPick(Model model, String oId) {
		Orders o = new Orders();
		o.setoId(oId);
		o.setoPaymentstate("已取消");
		orderService.updateByPrimaryKeySelective(o);
		return "redirect:/business/waitingOrder.jsp";
	}

	/**
	 * 单个商品不完成
	 * 
	 * @param model
	 * @param oId
	 * @return
	 */
	@RequestMapping("/notComplete")
	public String notComplete(Model model, String oId) {
		Orders o = new Orders();
		o.setoId(oId);
		o.setoPaymentstate("已取消");
		orderService.updateByPrimaryKeySelective(o);
		return "redirect:/business/proceedOrder.jsp";
	}

	/**
	 * 单个商品完成
	 * 
	 * @param model
	 * @param oId
	 * @return
	 */
	@RequestMapping("/complete")
	public String complete(Model model, String oId) {
		Orders o = new Orders();
		o.setoId(oId);
		o.setoPaymentstate("已完成");
		orderService.updateByPrimaryKeySelective(o);
		return "redirect:/business/proceedOrder.jsp";
	}

	/**
	 * 全部接单
	 * 
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping("/allTake")
	public String allTake(Model model, HttpServletRequest request) {
		String bId = (String) request.getSession().getAttribute("businessName");
		List<Orders> orders = orderService.findWaitingOrder(bId);
		for (Orders order : orders) {
			Orders record = new Orders();
			record.setoId(order.getoId());
			record.setbId(order.getbId());
			record.setoPaymentstate("进行中");
			orderService.updateByPrimaryKeySelective(record);
		}
		return "redirect:/business/proceedOrder.jsp";
	}

	/**
	 * 全部不接单
	 * 
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping("/allNotTake")
	public String allNotTake(Model model, HttpServletRequest request) {
		String bId = (String) request.getSession().getAttribute("businessName");
		List<Orders> orders = orderService.findWaitingOrder(bId);
		for (Orders order : orders) {
			Orders record = new Orders();
			record.setoId(order.getoId());
			record.setbId(order.getbId());
			record.setoPaymentstate("已取消");
			orderService.updateByPrimaryKeySelective(record);
		}
		return "redirect:/business/cancelOrder.jsp";
	}

	/**
	 * 全部不完成
	 * 
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping("/allNotComplete")
	public String allNotComplete(Model model, HttpServletRequest request) {
		String bId = (String) request.getSession().getAttribute("businessName");
		List<Orders> orders = orderService.findProceedOrder(bId);
		for (Orders order : orders) {
			Orders record = new Orders();
			record.setoId(order.getoId());
			record.setbId(order.getbId());
			record.setoPaymentstate("已取消");
			orderService.updateByPrimaryKeySelective(record);
		}
		return "redirect:/business/cancelOrder.jsp";
	}

	/**
	 * 全部完成
	 * 
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping("/allComplete")
	public String allComplete(Model model, HttpServletRequest request) {
		String bId = (String) request.getSession().getAttribute("businessName");
		List<Orders> orders = orderService.findProceedOrder(bId);
		for (Orders order : orders) {
			Orders record = new Orders();
			record.setoId(order.getoId());
			record.setbId(order.getbId());
			record.setoPaymentstate("已完成");
			orderService.updateByPrimaryKeySelective(record);
		}
		return "redirect:/business/completeOrder.jsp";
	}
	
	/**
	 * 下架商品
	 * @param model
	 * @param gId
	 * @return
	 */
	@RequestMapping("/downGood")
	public String downGood(Model model, String gId) {
		Goods record = new Goods();
		record.setgId(gId);
		record.setgSale(0);
		orderService.updateByPrimaryKeySelective(record);
		return "redirect:/business/sellMerchandise.jsp";
	}
	/**
	 * 上架商品
	 * @param model
	 * @param gId
	 * @return
	 */
	@RequestMapping("/upGood")
	public String upGood(Model model, String gId) {
		Goods record = new Goods();
		record.setgId(gId);
		record.setgSale(1);
		orderService.updateByPrimaryKeySelective(record);
		return "redirect:/business/Merchandise.jsp";
	}
	/**
	 * 删除商品
	 * @param model
	 * @param gId
	 * @return
	 */
	@RequestMapping("/deleteGood")
	public String deleteGood(Model model, String gId) {
		
		orderService.deleteByPrimaryKey(gId);
		return "redirect:/business/Merchandise.jsp";
	}
}