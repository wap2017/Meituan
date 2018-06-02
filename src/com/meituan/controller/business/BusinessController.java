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
	 * ���һ��ж�����δ��֤
	 * 
	 * @return
	 */

	@ResponseBody
	public int reject() {

		return businessService.count();
	}

	/**
	 * �ܾ���֤
	 * 
	 * @return
	 */
	@RequestMapping("/reject")
	public String reject(String bId) {
		businessService.reject(bId);
		return "identification";
	}

	/**
	 * ������֤
	 * 
	 * @return
	 */
	@RequestMapping("/accept")
	public String accept(String bId) {
		businessService.accept(bId);
		return "identification";
	}

	/**
	 * �ҵ�δ��֤��һ����¼
	 * 
	 * @return
	 */
	@RequestMapping("/findBusinessWithoutIdentify")
	@ResponseBody
	public Business findBusinessWithoutIdentify() {
		return businessService.findBussinessWithoutIdentify();
	}

	/**
	 * �ҵ����е��û���¼��һ�η��أ���ǰ�˽��з�ҳ
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
	 * �ҵ����е��û���¼��һ�η��أ���ǰ�˽��з�ҳ
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
