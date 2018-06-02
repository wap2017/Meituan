package com.meituan.controller.admin;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.meituan.pojo.Admin;
import com.meituan.service.admin.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Resource(name = "AdminService")
	private AdminService adminService;


	/**
	 * �ҵ����е��û���¼��һ�η��أ���ǰ�˽��з�ҳ
	 * 
	 * @param model
	 * @return
	 */

	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String findAdmin(HttpServletRequest request,String aId,String psw) {
		Admin admin=adminService.findBusiness(aId);
		
		try {
	
		if(admin.getaPwd().equals(psw))
		{
			request.getSession().setAttribute("username", admin.getaId());;
			return "orders";
			
		}else{
			
			return "login";
		}
		} catch (Exception e) {
			return "login";
		}
	}


}
