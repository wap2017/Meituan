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


}
