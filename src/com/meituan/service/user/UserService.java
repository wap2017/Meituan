package com.meituan.service.user;


import java.util.List;

import com.github.pagehelper.PageInfo;
import com.meituan.pojo.User;

public interface UserService {

	
	int updateUser(User user);
	
	User findUser(String uId);
	
    int delUser(String  uId);
		
	List<User> findAllUsers();
	
	/**
	 * 注册用户（管理员注册需要的信息比较多，用户端注册时只需要账号和密码）
	 * @param user
	 * @return
	 */
	int registerUser(User user);
	
	
	
	
	// 根据用户id查询默认地址
	User findUserById(String id);

	PageInfo<User> findUsers(int curPage,int pageSize);
	
	/**
	 * 根据注册时用户的账号名查询该账号是否已经被注册
	 * @param uNickname
	 * @return
	 */
	int findUserByUNickname(String uNickname);
	
	
}
