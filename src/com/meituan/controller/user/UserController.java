package com.meituan.controller.user;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;
import com.meituan.pojo.User;
import com.meituan.service.user.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource(name = "UserService")
	private UserService userService;
	
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(HttpServletRequest request,String uId, String uNickname, Double uAccount,
			@RequestParam("file") MultipartFile file) {

		  System.out.println(uId);
		  System.out.println(uNickname);
		  System.out.println(uAccount);
		  
		  User u=userService.findUser(uId);
		  if(uAccount!=null)
		   u.setuAccount(uAccount);
		  if(uNickname!=null&&uNickname.trim()!="")
		   u.setuNickname(uNickname);
		  
		  
		  
		String picture=u.getuPicture();
		if (!file.isEmpty()) {
			try {

				String filePath = request.getSession().getServletContext().getRealPath("/") + "users/" + uId + "_"
						+ file.getOriginalFilename();
				picture=uId+"_"+file.getOriginalFilename();
				// 转存文件
				file.transferTo(new File(filePath));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		u.setuPicture(picture);
		userService.updateUser(u);
		return "users";
	}

	
	
	/**
	 * 找到所有的用户记录，一次返回，由前端进行分页
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/delUser")
	public String delUser(Model model,String uId) {
		System.out.println("uId="+uId);
		 userService.delUser(uId);
		 return "users";
	}
	
	

	/**
	 * 找到所有的用户记录，一次返回，由前端进行分页
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/findAll")
	@ResponseBody
	public List<User> findAll(Model model) {
		List<User> result = userService.findAllUsers();
		return result;
	}

	/**
	 * 注册用户
	 * 
	 * @param model
	 * @param uPicture
	 * @param uNickname
	 * @param uSex
	 * @param uAddress
	 * @param uIsban
	 * @return
	 */
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(HttpServletRequest request, String uNickname, Double uAccount, String uPassword,
			@RequestParam("file") MultipartFile file) {

		UUID uid = UUID.randomUUID();
		String str = (uid + "").replace("-", "");
		String picture="default.jpg";
		if (!file.isEmpty()) {
			try {

				String filePath = request.getSession().getServletContext().getRealPath("/") + "users/" + str + "_"
						+ file.getOriginalFilename();
				picture=str+"_"+file.getOriginalFilename();
				// 转存文件
				file.transferTo(new File(filePath));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		User u = new User();
		u.setuId(str);
		u.setuNickname(uNickname);
		u.setuAccount(uAccount);
		u.setuPassword(uPassword);
		u.setuIsban(0);
		u.setuPicture(picture);
		userService.registerUser(u);
		return "users";
	}

	/**
	 * 自己写的分页，如果需要后台进行分页，可以调用这个函数
	 * 
	 * @param model
	 * @param curPage
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("/find")
	@ResponseBody
	public PageInfo<User> find(Model model, @RequestParam(defaultValue = "0") Integer curPage,
			@RequestParam(defaultValue = "11") Integer pageSize) {
		System.out.println("c=" + curPage);
		System.out.println(pageSize);
		PageInfo<User> result = userService.findUsers(curPage, pageSize);
		return result;
	}

	// 以下是测试是否能够访问到controller的方法
	@RequestMapping("/fileUpload")
	public String fileUpload(HttpServletRequest request, @RequestParam("file") MultipartFile file) {
		// 判断文件是否为空
		if (request == null) {
			System.out.println("request is null");
		}
		if (!file.isEmpty()) {
			try {
				// 文件保存路径
				UUID uid = UUID.randomUUID();
				String str = (uid + "").replace("_", "");
				String filePath = request.getSession().getServletContext().getRealPath("/") + "users/" + str + "_"
						+ file.getOriginalFilename();
				System.out.println(file.getOriginalFilename() + "abc");
				System.out.println(filePath);
				// 转存文件
				file.transferTo(new File(filePath));
			} catch (Exception e) {
				System.out.println("异常啦");
				e.printStackTrace();
			}
		}
		// 重定向
		return "users";
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

}
