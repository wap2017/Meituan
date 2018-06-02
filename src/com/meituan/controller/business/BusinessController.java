package com.meituan.controller.business;

import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.meituan.pojo.Business;
import com.meituan.service.business.BusinessService;

@Controller
@RequestMapping("/business")
public class BusinessController {

	@Resource(name = "BusinessService")
	private BusinessService businessService;

	
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String Update(HttpServletRequest request,String bId,String bShopname,String sStatetype,String sResponsible,String sTelephone,String sAddress,String sHours) {

		Business b=businessService.findBusiness(bId);
		
		b.setbShopname(bShopname);
		b.setsStatetype(sStatetype);
		b.setsResponsible(sResponsible);
		b.setsTelephone(sTelephone);
		b.setsAddress(sAddress);
		b.setsHours(sHours);
		
		businessService.updateBussiness(b);
		return "business";
	}

	/**
	 * 查找还有多少条未认证
	 * 
	 * @return
	 */

	@ResponseBody
	public int reject() {

		return businessService.count();
	}

	/**
	 * 拒绝认证
	 * 
	 * @return
	 */
	@RequestMapping("/reject")
	public String reject(String bId) {
		businessService.reject(bId);
		return "identification";
	}

	/**
	 * 接受认证
	 * 
	 * @return
	 */
	@RequestMapping("/accept")
	public String accept(String bId) {
		businessService.accept(bId);
		return "identification";
	}

	/**
	 * 找到未认证的一条记录
	 * 
	 * @return
	 */
	@RequestMapping("/findBusinessWithoutIdentify")
	@ResponseBody
	public Business findBusinessWithoutIdentify() {
		return businessService.findBussinessWithoutIdentify();
	}

	/**
	 * 找到所有的用户记录，一次返回，由前端进行分页
	 * 
	 * @param model
	 * @return
	 */

	@RequestMapping("/delBusiness")
	public String delUser(Model model, String bId) {
		businessService.delBusiness(bId);
		return "business";
	}

	/**
	 * 找到所有的用户记录，一次返回，由前端进行分页
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/findAll")
	@ResponseBody
	public List<Business> findAll(Model model) {
		List<Business> result = businessService.findAllBussiness();
		return result;
	}

}
