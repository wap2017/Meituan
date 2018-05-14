package com.meituan.service.user;


import com.github.pagehelper.PageInfo;
import com.meituan.pojo.EUDataGridResult;
import com.meituan.pojo.User;

public interface UserService {

	// 根据用户id查询默认地址
	User findUserById(String id);

	PageInfo<User> findUsers(int curPage,int pageSize);

	int registerUser(User user);
	

}
