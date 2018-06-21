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
	// -------------�̼�--------------------------

	/**
	 * ���Ӧ�̼ҵĽ��ն�����,�ܶ�����
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
	 * ���Ӧ�̼ҵĽ���Ӫҵ��,��Ӫҵ��
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
	 * ���Ҷ�Ӧ�̼Ҵ��ӵ��Ķ���
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
	 * ���Ҷ�Ӧ�̼ҽ����еĶ���
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
	 * ���Ҷ�Ӧ�̼�����ɵĶ���
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
	 * ���Ҷ�Ӧ�̼���ȡ���Ķ���
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
	 * �������ж���
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

	// ���Ҷ�Ӧ�Ķ����ж�Ӧ���ջ���ַ����Ӧ����Ʒ����
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
	 * ������Ʒ�ӵ�
	 * 
	 * @param model
	 * @param oId
	 * @return
	 */
	@RequestMapping("/pick")
	public String pick(Model model, String oId) {
		Orders o = new Orders();
		o.setoId(oId);
		o.setoPaymentstate("������");
		orderService.updateByPrimaryKeySelective(o);
		return "redirect:/business/waitingOrder.jsp";
	}

	/**
	 * ������Ʒ���ӵ�
	 * 
	 * @param model
	 * @param oId
	 * @return
	 */
	@RequestMapping("/notPick")
	public String notPick(Model model, String oId) {
		Orders o = new Orders();
		o.setoId(oId);
		o.setoPaymentstate("��ȡ��");
		orderService.updateByPrimaryKeySelective(o);
		return "redirect:/business/waitingOrder.jsp";
	}

	/**
	 * ������Ʒ�����
	 * 
	 * @param model
	 * @param oId
	 * @return
	 */
	@RequestMapping("/notComplete")
	public String notComplete(Model model, String oId) {
		Orders o = new Orders();
		o.setoId(oId);
		o.setoPaymentstate("��ȡ��");
		orderService.updateByPrimaryKeySelective(o);
		return "redirect:/business/proceedOrder.jsp";
	}

	/**
	 * ������Ʒ���
	 * 
	 * @param model
	 * @param oId
	 * @return
	 */
	@RequestMapping("/complete")
	public String complete(Model model, String oId) {
		Orders o = new Orders();
		o.setoId(oId);
		o.setoPaymentstate("�����");
		orderService.updateByPrimaryKeySelective(o);
		return "redirect:/business/proceedOrder.jsp";
	}

	/**
	 * ȫ���ӵ�
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
			record.setoPaymentstate("������");
			orderService.updateByPrimaryKeySelective(record);
		}
		return "redirect:/business/proceedOrder.jsp";
	}

	/**
	 * ȫ�����ӵ�
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
			record.setoPaymentstate("��ȡ��");
			orderService.updateByPrimaryKeySelective(record);
		}
		return "redirect:/business/cancelOrder.jsp";
	}

	/**
	 * ȫ�������
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
			record.setoPaymentstate("��ȡ��");
			orderService.updateByPrimaryKeySelective(record);
		}
		return "redirect:/business/cancelOrder.jsp";
	}

	/**
	 * ȫ�����
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
			record.setoPaymentstate("�����");
			orderService.updateByPrimaryKeySelective(record);
		}
		return "redirect:/business/completeOrder.jsp";
	}
	
	/**
	 * �¼���Ʒ
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
	 * �ϼ���Ʒ
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
	 * ɾ����Ʒ
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