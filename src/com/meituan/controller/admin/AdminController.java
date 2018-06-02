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
	 * 找到所有的用户记录，一次返回，由前端进行分页
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
