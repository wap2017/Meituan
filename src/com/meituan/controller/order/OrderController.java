package com.meituan.controller.order;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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


}
