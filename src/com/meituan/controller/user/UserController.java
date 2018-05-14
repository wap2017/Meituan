package com.meituan.controller.user;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.meituan.pojo.EUDataGridResult;
import com.meituan.pojo.User;
import com.meituan.service.user.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource(name = "UserService")
	private UserService userService;
	
	@RequestMapping("/register")
	public String register(Model model,String uPicture,String uNickname,String uSex,String uAddress,Integer uIsban) {
		//http:localhost/Meituan/user/register?uId=3&uPicture=AAA.JPG&uNickname=小刘&uSex=男&uAddress=北京&uIsban=1
		User u=new User();
		u.setuPicture(uPicture);
		u.setuNickname(uNickname);
		u.setuSex(uSex);
		u.setuAddress(uAddress);
		u.setuIsban(uIsban);
		userService.registerUser(u);
		return "list";
	}
	

	@RequestMapping("/list")
	public String toList() {
		return "list";
	}

	@RequestMapping("/findDefaultAddress")
	@ResponseBody
	public User findDefaultAddress(String uId) {
		System.out.println("uId=" + uId);
		User user = userService.findUserById(uId);
		return user;
	}

	@RequestMapping("/find")
	@ResponseBody
	public PageInfo<User> find(Model model, @RequestParam(defaultValue = "0") Integer curPage,
			@RequestParam(defaultValue = "2") Integer pageSize) {
		System.out.println(curPage);
		System.out.println(pageSize);
		PageInfo<User> result = userService.findUsers(curPage, pageSize);
		return result;
	}

}
