package com.meituan.service.user;


import java.util.List;

import com.github.pagehelper.PageInfo;
import com.meituan.pojo.User;

public interface UserService {

	
	int updateUser(User user);
	
	User findUser(String uId);
	
    int delUser(String  uId);
		
	List<User> findAllUsers();

	int registerUser(User user);
	
	
	
	
	// 根据用户id查询默认地址
	User findUserById(String id);

	PageInfo<User> findUsers(int curPage,int pageSize);
	

}
