package com.meituan.controller.user;

import java.io.File;
import java.util.List;

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

	

	/**
	 * 找到所有的用户记录，一次返回，由前端进行分页
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
	 * @param model
	 * @param uPicture
	 * @param uNickname
	 * @param uSex
	 * @param uAddress
	 * @param uIsban
	 * @return
	 */
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(Model model, String uPicture, String uNickname, String uSex, String uAddress,
			Integer uIsban) {
		// http:localhost/Meituan/user/register?uId=3&uPicture=AAA.JPG&uNickname=小刘&uSex=男&uAddress=北京&uIsban=1
		System.out.println("model="+model);
		System.out.println("uNickname="+uNickname);
		
		
//	    private String uId;
//	    private String uPicture;
//	    private String uPassword;
//	    private Double uAccount;
	    
	    
		User u = new User();
		u.setuPicture(uPicture);
		u.setuNickname(uNickname);
		u.setuIsban(uIsban);
		userService.registerUser(u);
		return "tables";
	}


	
	/**
	 * 自己写的分页，如果需要后台进行分页，可以调用这个函数
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

	 @RequestMapping("/fileUpload")  
	    public String fileUpload(HttpServletRequest request,@RequestParam("file") MultipartFile file) {  
	        // 判断文件是否为空  
		 if(request==null)
		 {
			 System.out.println("request is null");
		 }
	        if (!file.isEmpty()) {  
	            try {  
	                // 文件保存路径  
	                String filePath = request.getSession().getServletContext().getRealPath("/") + "images/"  
	                        + file.getOriginalFilename();  
	                // 转存文件  
	                file.transferTo(new File(filePath));  
	            } catch (Exception e) {  
	                e.printStackTrace();  
	            }  
	        }  
	        // 重定向  
	        return "tables";  
	    }  
	
	//以下是测试是否能够访问到controller的方法
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
